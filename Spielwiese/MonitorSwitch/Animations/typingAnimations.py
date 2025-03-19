import random
import pygame
import threading
import pyautogui
from pynput import keyboard, mouse

# Initialisiere Pygame
pygame.init()

# Bildschirmgröße holen
SCREEN_WIDTH, SCREEN_HEIGHT = pyautogui.size()

# Erstelle ein randloses, transparentes Fenster, das den ganzen Bildschirm abdeckt
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT), pygame.NOFRAME)
pygame.display.set_caption("Power Mode Overlay")
screen.set_alpha(None)  # Transparenz aktivieren

# Lade Bilder (ersetze durch deine eigenen Symbole)
image_files = [
    "Workspace-Settings\\Spielwiese\\MonitorSwitch\\Animations\\pictures\\image.png",
    "Workspace-Settings\\Spielwiese\\MonitorSwitch\\Animations\\pictures\\image copy.png"
]
images = [pygame.image.load(img) for img in image_files]

# Klasse für Partikel
class Particle:
    def __init__(self, x, y):
        self.image = random.choice(images)
        self.x = x
        self.y = y
        self.dy = random.uniform(-3, -1)  # Bewegung nach oben
        self.lifetime = 30  # Lebensdauer in Frames

    def update(self):
        self.y += self.dy
        self.lifetime -= 1

# Liste der Partikel
particles = []

# Funktion zum Erzeugen eines neuen Partikels an der Mausposition
def spawn_particle(x, y):
    particles.append(Particle(x, y))

# Event-Handling für Keyboard & Mouse
def on_press(key):
    try:
        x, y = pyautogui.position()  # Aktuelle Mausposition holen
        spawn_particle(x, y)
    except Exception as e:
        print(f"Error: {e}")

def on_click(x, y, button, pressed):
    if pressed:
        spawn_particle(x, y)

# Listener für Tastenanschläge und Mausklicks in separatem Thread starten
def start_listeners():
    with keyboard.Listener(on_press=on_press) as keyboard_listener, \
        mouse.Listener(on_click=on_click) as mouse_listener:
        keyboard_listener.join()
        mouse_listener.join()

listener_thread = threading.Thread(target=start_listeners, daemon=True)
listener_thread.start()

# Hauptloop für die Animation
running = True
clock = pygame.time.Clock()

while running:
    screen.fill((0, 0, 0, 0))  # Vollständig transparent

    # Pygame-Events abfragen
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Partikel aktualisieren
    particles = [p for p in particles if p.lifetime > 0]
    for p in particles:
        p.update()
        screen.blit(p.image, (p.x, p.y))

    pygame.display.update()
    clock.tick(30)

pygame.quit()