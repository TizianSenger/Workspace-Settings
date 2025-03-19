import pynput
from pynput import keyboard, mouse
import pygame

pygame.mixer.init()

# Define sound files
sound_default = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\type.wav"
sound_space = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\space.wav"
sound_enter = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\enter.wav"
sound_delete = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\delete.wav"
sound_lclick = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\click.wav"
sound_rclick = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\rclick.wav"
sound_monkey = "Workspace-Settings\\Spielwiese\\MonitorSwitch\\typingSounds\\sounds\\monkey.wav"


# Load sounds
default_sound = pygame.mixer.Sound(sound_default)
space_sound = pygame.mixer.Sound(sound_space)
enter_sound = pygame.mixer.Sound(sound_enter)
delete_sound = pygame.mixer.Sound(sound_delete)
lclick_sound = pygame.mixer.Sound(sound_lclick)
rclick_sound = pygame.mixer.Sound(sound_rclick)
monkey_sound = pygame.mixer.Sound(sound_monkey)


pressed_keys = set()

def play_sound(sound):
    sound.play()

def on_press(key):
    try:
        if key not in pressed_keys:
            pressed_keys.add(key)
            if key == keyboard.Key.f11:
                play_sound(monkey_sound)
    except Exception as e:
        print(f"Error: {e}")

def on_release(key):
    if key in pressed_keys:
        pressed_keys.remove(key)


# Collect events until released
with keyboard.Listener(on_press=on_press, on_release=on_release) as keyboard_listener:
    keyboard_listener.join()
