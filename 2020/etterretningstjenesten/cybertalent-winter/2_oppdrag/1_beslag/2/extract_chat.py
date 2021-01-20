import sys
import frida
import requests

s = requests.Session()

def login():
    r = s.post("https://mobile.cybertalent.no/login", json={
        "user": "hungry_hippo_123",
        "pass": "secretpassword"
    });
    r.raise_for_status()
    j = r.json()
    if "success" not in j or j["success"] != "Logged in":
        print("Failed logging in:")
        print(j)
        exit(1)

def get_challenge():
    login()
    r = s.post("https://mobile.cybertalent.no/getchall")
    r.raise_for_status()
    return r.json()["chall"]

def get_token(response):
    r = s.post("https://mobile.cybertalent.no/challenge", json={
        "response": response
    })
    j = r.json()
    return j["success"]

def get_chat(token):
    r = s.get("https://mobile.cybertalent.no/chat?token=" + token)
    return r.content.decode()

def on_message(message, data):
    if "payload" in message:
        response = message["payload"].lower()
        print("Response:", response)
        token = get_token(response)
        print("Token:", token)
        chat = get_chat(token)
        print(chat)
    else:
        print(message)
        print(data)
    exit(0)

with open("frida-chat.js") as f:
    ss = f.read()

device = frida.get_usb_device()
pid = device.spawn(["no.cybertalent.liberatortoolkit"])
session = device.attach(pid)

script = session.create_script(ss)
script.on("message", on_message)
script.load()

challenge = get_challenge()
print("Challenge:", challenge)

script.exports.getResponse(challenge)
device.resume(pid)
sys.stdin.read()
