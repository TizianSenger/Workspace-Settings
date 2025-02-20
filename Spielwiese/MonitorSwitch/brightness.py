import ctypes
from ctypes import windll, byref, Structure, WinError, POINTER, WINFUNCTYPE
from ctypes.wintypes import BOOL, HMONITOR, HDC, RECT, LPARAM, DWORD, BYTE, WCHAR, HANDLE

_MONITORENUMPROC = WINFUNCTYPE(BOOL, HMONITOR, HDC, POINTER(RECT), LPARAM)

class PHYSICAL_MONITOR(Structure):
    _fields_ = [('handle', HANDLE), ('description', WCHAR * 128)]


class MONITORINFOEX(Structure):
    _fields_ = [("cbSize", DWORD), ("rcMonitor", RECT), ("rcWork", RECT),
                ("dwFlags", DWORD), ("szDevice", WCHAR * 32)]


def _iter_physical_monitors(close_handles=True):
    def callback(hmonitor, hdc, lprect, lparam):
        monitor_info = MONITORINFOEX()
        monitor_info.cbSize = ctypes.sizeof(MONITORINFOEX)
        if not windll.user32.GetMonitorInfoW(HMONITOR(hmonitor), byref(monitor_info)):
            raise WinError()
        monitors.append((HMONITOR(hmonitor), monitor_info.rcMonitor, monitor_info.szDevice))
        return True

    monitors = []
    if not windll.user32.EnumDisplayMonitors(None, None, _MONITORENUMPROC(callback), None):
        raise WinError('EnumDisplayMonitors failed')

    for monitor, rect, device in monitors:
        count = DWORD()
        if not windll.dxva2.GetNumberOfPhysicalMonitorsFromHMONITOR(monitor, byref(count)):
            raise WinError()
        physical_array = (PHYSICAL_MONITOR * count.value)()
        if not windll.dxva2.GetPhysicalMonitorsFromHMONITOR(monitor, count.value, physical_array):
            raise WinError()
        for physical in physical_array:
            yield physical.handle, rect, device
            if close_handles:
                if not windll.dxva2.DestroyPhysicalMonitor(physical.handle):
                    raise WinError()


def set_vcp_feature(monitor, code, value):
    if not windll.dxva2.SetVCPFeature(HANDLE(monitor), BYTE(code), DWORD(value)):
        raise WinError()


brightness = int(input("Gib die gewünschte Helligkeit in Prozent an: "))
brightness_value = int((brightness / 100) * 254)  # Helligkeit in einen Wert zwischen 0 und 254 umwandeln

for handle, rect, device in _iter_physical_monitors(close_handles=False):
    set_vcp_feature(handle, 0x10, brightness_value)
