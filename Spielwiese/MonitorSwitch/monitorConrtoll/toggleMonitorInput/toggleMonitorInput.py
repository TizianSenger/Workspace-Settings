import os
import ctypes
import tkinter as tk
from ctypes import windll, byref, Structure, WinError, POINTER, WINFUNCTYPE
from ctypes.wintypes import BOOL, HMONITOR, HDC, RECT, LPARAM, DWORD, BYTE, WCHAR, HANDLE

_MONITORENUMPROC = WINFUNCTYPE(BOOL, HMONITOR, HDC, POINTER(RECT), LPARAM)

DECISION_FILE = 'monitor_input_decisions.txt'

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


def show_input_dialog(monitor_handle, x, y, device_name):
    def on_select_input(selected_input):
        if selected_input == "HDMI":
            set_vcp_feature(monitor_handle, 0x60, 0x11)
            decision = "HDMI"
        elif selected_input == "DisplayPort":
            set_vcp_feature(monitor_handle, 0x60, 0x0F)
            decision = "DisplayPort"
        with open(DECISION_FILE, 'a') as f:
            f.write(f"{device_name},{decision}\n")
        root.destroy()

    root = tk.Tk()
    root.title("Input Selection")
    root.geometry(f"400x300+{x}+{y}")

    label = tk.Label(root, text="Wähle den Eingang für diesen Monitor:")
    label.pack(pady=10)

    label1 = tk.Label(root, text="Links: HDMI=BOSYS")
    label1.pack(pady=5)

    label2 = tk.Label(root, text="Mitte: HDMI=BOSYS")
    label2.pack(pady=5)

    label3 = tk.Label(root, text="Rechts: DISPLAYPORT=BOSYS")
    label3.pack(pady=5)

    hdmi_button = tk.Button(root, text="HDMI", command=lambda: on_select_input("HDMI"))
    hdmi_button.pack(pady=5)

    dp_button = tk.Button(root, text="DisplayPort", command=lambda: on_select_input("DisplayPort"))
    dp_button.pack(pady=5)

    root.mainloop()


def read_decisions():
    if not os.path.exists(DECISION_FILE):
        return {}
    with open(DECISION_FILE, 'r') as f:
        decisions = {}
        for line in f:
            device, decision = line.strip().split(',')
            decisions[device] = decision
        return decisions


decisions = read_decisions()

for handle, rect, device in _iter_physical_monitors(close_handles=False):
    if device in decisions:
        if decisions[device] == "HDMI":
            set_vcp_feature(handle, 0x60, 0x11)
        elif decisions[device] == "DisplayPort":
            set_vcp_feature(handle, 0x60, 0x0F)
    else:
        x, y = rect.left, rect.top
        show_input_dialog(handle, x, y, device)



#ctypes.windll.user32.LockWorkStation()