import ctypes
import pyautogui
import time
import threading
import os
import signal
import customtkinter

# FAILSAFE deaktivieren (bitte mit Vorsicht verwenden)
pyautogui.FAILSAFE = False

# Funktion, die die Strg-Taste drückt
def druecke_ctrl():
    while True:
        pyautogui.keyDown('ctrl')
        pyautogui.keyUp('ctrl')
        time.sleep(10)

# Benutzeroberfläche erstellen
def create_ui():
    # Initialisiere customtkinter
    customtkinter.set_appearance_mode("System")  # Optionen: "Light", "Dark", "System"
    customtkinter.set_default_color_theme("blue")  # Farbe

    # Fenster erstellen
    app = customtkinter.CTk()
    app.geometry("300x150")
    app.title("Skript Controller")
    app.attributes("-topmost", True)  # Fenster bleibt immer im Vordergrund

    # Funktion zum Beenden des Skripts
    def beenden():
        os.kill(os.getpid(), signal.SIGTERM)  # Beendet das aktuelle Skript

    # Button hinzufügen
    button = customtkinter.CTkButton(master=app, text="Skript beenden", command=beenden)
    button.pack(pady=30)  # Platzierung und Abstand des Buttons

    # UI starten
    app.mainloop()

# Hauptlogik
if __name__ == "__main__":
    # Starte den Thread für das Strg-Taste-Drücken
    thread = threading.Thread(target=druecke_ctrl, daemon=True)
    thread.start()

    # Starte die Benutzeroberfläche
    create_ui()
