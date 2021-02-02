import time
import pickle
import base64
import requests

from datetime import datetime

URL = "http://math:7070/challenge"
HEADERS = {"User-agent": "Math Calculator (Python 3)"}


while True:
    now = datetime.now()
    r = requests.get(URL, headers=HEADERS)
    eq = r.content.decode()
    ans = eval(eq)
    cookie = r.cookies["user_id"][2:][:-1]

    sig, msg = cookie.split("?")

    sig_decoded = base64.b64decode(sig)
    sig_hex = sig_decoded.hex()
    msg_decoded = base64.b64decode(msg)

    dst = pickle.loads(msg_decoded)


    with open("cookies.csv", "a") as fp:
        fp.write(now.isoformat() + "," + str(cookie) + "," + str(sig) + "," + str(msg) + "," + str(sig_hex) + "," + str(dst[1]) + "," + str(eq) + "," + str(ans) + "\n")
    print(now.isoformat(), sig_hex, dst[1], eq, ans, sep="\t")
    time.sleep(1)
