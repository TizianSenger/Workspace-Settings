import pyautogui
import keyboard
import time
import pygetwindow as gw
import pywinctl

def get_caret_position():
    """Ermittelt die Position des Textcursors."""
    try:
        # Screenshot des Bildschirms erstellen
        screenshot = pyautogui.screenshot()

        # Sucht nach der I-Beam-Cursor-Form (nur für Windows sicher)
        caret_color = (0, 0, 0)  # Schwarzer Textcursor
        width, height = screenshot.size

        for x in range(width):
            for y in range(height):
                if screenshot.getpixel((x, y)) == caret_color:
                    return x, y
    except Exception as e:
        print("Fehler beim Ermitteln der Cursorposition:", e)
    return None

def move_mouse_to_caret():
    """Bewegt die Maus an die Position des Textcursors."""
    pos = get_caret_position()
    if pos:
        print("Textcursor gefunden")
        pyautogui.moveTo(pos)
    else:
        print("Textcursor konnte nicht gefunden werden.")

# Hotkey setzen
keyboard.add_hotkey("ctrl+x", move_mouse_to_caret)

print("Drücke STRG+X, um die Maus zum Textcursor zu bewegen.")
keyboard.wait("esc")  # Skript läuft, bis ESC gedrückt wird