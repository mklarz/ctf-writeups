import frida
import sys

PACKAGE_NAME = "no.cybertalent.liberatortoolkit"

def on_message(message, data):
    print(message)


with open("frida-vault.js") as f:
    ss = f.read()

# Get our emulator
device = frida.get_usb_device()

# 1118  Liberator Toolkit 3000                  no.cybertalent.liberatortoolkit
pid = device.spawn([PACKAGE_NAME])
session = device.attach(pid)

script = session.create_script(ss)
script.on("message", on_message)
script.load()
device.resume(pid)
sys.stdin.read()
