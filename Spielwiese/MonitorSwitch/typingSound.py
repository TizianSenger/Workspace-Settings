import pynput
from pynput import keyboard
import pygame

pygame.mixer.init()

# Define sound files
sound_default = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\sounds\\type.wav"
sound_space = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\sounds\\space.wav"
sound_enter = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\sounds\\enter.wav"
sound_delete = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\sounds\\delete.wav"

# Load sounds
default_sound = pygame.mixer.Sound(sound_default)
space_sound = pygame.mixer.Sound(sound_space)
enter_sound = pygame.mixer.Sound(sound_enter)
delete_sound = pygame.mixer.Sound(sound_delete)

def play_sound(sound):
    sound.play()

def on_press(key):
    try:
        if key == keyboard.Key.space:
            play_sound(space_sound)
        elif key == keyboard.Key.enter:
            play_sound(enter_sound)
        elif key == keyboard.Key.backspace:
            play_sound(delete_sound)
        else:
            play_sound(default_sound)
    except Exception as e:
        print(f"Error: {e}")

# Collect events until released
with keyboard.Listener(on_press=on_press) as listener:
    listener.join()
