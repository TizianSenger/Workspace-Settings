toggle := true  ; Standard: Ersetzung ist aktiv

F5::
{
    global toggle  ; Deklariert die Variable als global
    toggle := !toggle  ; Umschalten zwischen an/aus
    ToolTip("Hotstrings " (toggle ? "aktiviert" : "deaktiviert")) ; Status anzeigen
    SetTimer RemoveToolTip, -1000  ; Tooltip nach 1 Sekunde entfernen
}
return

#HotIf toggle  ; Aktiviert Hotstrings nur, wenn "toggle" auf true gesetzt ist
:?*:ae::ä
:?*:oe::ö
:?*:ue::ü
:?*:Ae::Ä
:?*:Oe::Ö
:?*:Ue::Ü
:?*:ssss::ß
#HotIf  ; Deaktiviert die Bedingung

RemoveToolTip() {
    tooltip
}
