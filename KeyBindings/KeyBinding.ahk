#Requires AutoHotkey v2.0
RSHift::Down
+RSHift::Up
CapsLock::Esc
´::Send("!+a")
<^>!LSHift::Send("^!7^!0")
<^>!s:: ; AltGr (Right Alt) + s to trigger Sysout shortcut in Eclipse
{
    Send("sysout") ; Sends "sysout"
    Sleep(50)
    Send("{Ctrl Down}{Space Down}") ; Presses Ctrl+Space
    Sleep(50)
    Send("{Space Up}{Ctrl Up}") ; Releases Ctrl+Space
    Sleep(50)
    Send("{Enter}") ; Presses Enter
}
;Volume_Up::WheelUp
;Volume_Down::WheelDown


