import os
import sys
import base64
from pwn import *
from Crypto.Cipher import ARC4


DEBUG = True

"""
Header:
    Magic = 4 bytes
    Seq num = 8 bytes
    Instruction = 1 byte
    Length = 8 = bytes
Body (Content):
    x bytes
"""

HEADER_MAGIC = 0x46494c45

HEADER_MAGIC_LENGTH = 4
HEADER_SEQ_NUM_LENGTH = 8
HEADER_INSTRUCTION_LENGTH = 1
HEADER_LENGTH_LENGTH = 8

INSTRUCTION_CONNECT = 0
INSTRUCTION_LOGIN = 1
INSTRUCTION_OKAY = 2
INSTRUCTION_LIST_FILES = 3 # List files in the current directory
INSTRUCTION_CHANGE_DIR = 4 # Change directory
INSTRUCTION_OPEN_FILE = 5 # Open a file
INSTRUCTION_PRINT_FILE = 6 # Print the current opened file
INSTRUCTION_WRITE_FILE = 7 # Write to the current opened file
INSTRUCTION_DISCONNECT = 8
INSTRUCTION_REQUEST_CREDENTIALS = 9
INSTRUCTION_RC4_KEY = 10
INSTRUCTION_ALG = 11
INSTRUCTION_SUCCESS = 12
INSTRUCTION_FAILURE = 13

INSTRUCTIONS = {
    INSTRUCTION_CONNECT: "CONNECT",
    INSTRUCTION_LOGIN: "LOGIN",
    INSTRUCTION_OKAY: "OKAY",
    INSTRUCTION_LIST_FILES: "LIST_FILES",
    INSTRUCTION_CHANGE_DIR: "CHANGE_DIR",
    INSTRUCTION_OPEN_FILE: "OPEN_FILE",
    INSTRUCTION_PRINT_FILE: "PRINT_FILE",
    INSTRUCTION_REQUEST_CREDENTIALS: "REQUEST_CREDENTIALS",
    INSTRUCTION_RC4_KEY: "RC4_KEY",
    INSTRUCTION_ALG: "ALG",
    INSTRUCTION_SUCCESS: "SUCCESS",
    INSTRUCTION_FAILURE: "FAILURE",
    None: "NoOp",
}

# Absolute paths
IGNORED_CRAWLER_FILESYSTEM_DIRECTORIES = [
    # Let's prevent forever loops
    "/proc/self/task/1/root",
    "/proc/self/root",
    "/proc/thread-self/root",
    "/proc/1/task/1/root",
    "/proc/1/root",
    # Let's prevent some errors (files with ":" in their names cause issues for some reason)
    "/sys",
    "/usr/share/man",
    "/var/lib/dpkg/info",
    # TODO: delete
    "/proc",
]

class PacketFailureException(Exception):
    pass

class Packet:
    def __init__(
        self, raw=None,
        seq_num=0, instruction=None, body=b"",
    ):
        if raw:
            self.raw = raw
            self._parse()
        else:
            self.magic = HEADER_MAGIC
            self.seq_num = seq_num
            self.instruction = instruction
            self.length = len(body)
            self.body = body

    @staticmethod
    def pack(value, length):
        return int.to_bytes(value, length=length, byteorder="big")

    @staticmethod
    def unpack(value): 
        return int.from_bytes(value, byteorder="big")

    def _parse(self):
        i = HEADER_MAGIC_LENGTH
        self.magic = Packet.unpack(self.raw[:i])
        j = i + HEADER_SEQ_NUM_LENGTH
        self.seq_num = Packet.unpack(self.raw[i:j])
        i = j
        j += HEADER_INSTRUCTION_LENGTH
        self.instruction = Packet.unpack(self.raw[i:j])
        i = j
        j += HEADER_LENGTH_LENGTH
        self.length = Packet.unpack(self.raw[i:j])
        self.body = self.raw[j:]
        if self.body != b"":
            try:
                self.body = base64.b64decode(self.body + b"===")
            except Exception:
                print("[ERROR] Failed decoding body:")
                print(self.body)
        if DEBUG:
            print("magic", self.magic)
            print("seq_num", self.seq_num)
            print("instruction", self.instruction)
            print("length", self.length)
            print("body", self.body)

    def format(self):
        r = b""
        r += Packet.pack(self.magic, length=HEADER_MAGIC_LENGTH)
        r += Packet.pack(self.seq_num, length=HEADER_SEQ_NUM_LENGTH)
        r += Packet.pack(self.instruction, length=HEADER_INSTRUCTION_LENGTH)
        r += Packet.pack(self.length, length=HEADER_LENGTH_LENGTH)
        r += self.body
        return r

    def __str__(self):
        h = self.format().hex()
        s = []
        i = HEADER_MAGIC_LENGTH * 2
        s.append(h[:i])
        j = i + (HEADER_SEQ_NUM_LENGTH * 2)
        s.append(h[i:j])
        i = j
        j += HEADER_INSTRUCTION_LENGTH * 2
        s.append(h[i:j])
        i = j
        j += HEADER_LENGTH_LENGTH * 2
        s.append(h[i:j])
        s.append(h[j:])
        return " ".join(s)
        


class Client:
    def __init__(self, host, port):
        self.host = host
        self.port = port
        self.seq_num = 0
        self.current_encrypted = b""
        self.current_pwd = "/tmp/transfer"
        self.last_instruction = None
        self.last_decrypt = b""
        self.arc4 = None

    def handle_packet(self, packet):
        if DEBUG:
            print("<- [{}]".format(INSTRUCTIONS.get(packet.instruction, "UNKNOWN")), str(packet))

        self.seq_num = packet.seq_num
        i = packet.instruction

        instruction = None
        body = b""
        if i == INSTRUCTION_REQUEST_CREDENTIALS: # i = 9
            instruction = INSTRUCTION_LOGIN
            body = b"guest:guest"
        elif i == INSTRUCTION_RC4_KEY: # i = 10
            self.rc4_key = packet.body
            instruction = INSTRUCTION_OKAY
        elif i == INSTRUCTION_ALG: # i = 11
            self.alg = packet.body # RC4
            instruction = INSTRUCTION_LIST_FILES
        elif i == INSTRUCTION_SUCCESS: # i = 12
            self.current_encrypted += packet.body
            self.arc4 = ARC4.new(self.rc4_key)
            decrypted = self.arc4.decrypt(self.current_encrypted)
            cleaned = decrypted.replace(self.last_decrypt, b"")
            self.last_decrypt = decrypted

            cleaned = cleaned.decode().split("\n")
            if self.last_instruction == INSTRUCTION_LIST_FILES \
            or self.last_instruction == INSTRUCTION_CHANGE_DIR:
                # Remove the first line
                cleaned = cleaned[1:]
            return "\n".join(cleaned).strip()
        elif i == INSTRUCTION_FAILURE: # i = 13
            print("[ERROR]", packet.body.decode())
            return True
        else:
            print("[ERROR] Unknown packet:")
            print(packet)
            exit(1)

        if not instruction:
            return None

        self.send(instruction, body)

        if DEBUG:
            print("="*24)
            print(p)
        return True

    def send(self, instruction, body=b""):
        if self.current_encrypted != b"":
            body = self.arc4.encrypt(body)
            self.current_encrypted += body

        body = base64.b64encode(body)
        packet = Packet(
            seq_num=self.seq_num,
            instruction=instruction,
            body=body,
        )
        self.last_instruction = instruction
        if DEBUG:
            print("-> [{}]".format(INSTRUCTIONS.get(packet.instruction, "UNKNOWN")), str(packet))
        self.io.sendline(packet.format())

    def recv(self):
        return self.handle_packet(Packet(raw=self.io.recv()))

    def connect(self):
        self.io = remote(self.host, self.port)
        self.send(instruction=INSTRUCTION_CONNECT)

        while True:
            result = self.recv()
            if not result or result is not True:
                break

        # Auto solve FLAG 1 and 2 first
        print("Flag 1:")
        self.send(INSTRUCTION_OPEN_FILE, b"FLAG_1")
        self.recv()
        self.send(INSTRUCTION_PRINT_FILE)
        print(self.recv())

        print("Flag 2:")
        self.send(INSTRUCTION_OPEN_FILE, b"FLAG_2")
        self.recv()
        self.send(INSTRUCTION_PRINT_FILE)
        print(self.recv())

        # Start client
        while True:
            args = input("root@transfer:{}$ ".format(self.current_pwd)).strip().split()
            if len(args) == 0:
                continue
            command = args[0].lower()
            if command in ["ls", "l"]:
                self.send(INSTRUCTION_LIST_FILES)
            elif command in ["cd"]:
                if len(args) == 1:
                    continue
                self.current_pwd = os.path.abspath(os.path.join(self.current_pwd, args[1]))
                self.send(INSTRUCTION_CHANGE_DIR, self.current_pwd)
            elif command in ["cat"]:
                if len(args) == 1:
                    continue
                filename = args[1]
                self.send(INSTRUCTION_OPEN_FILE, filename)
                self.recv()
                self.send(INSTRUCTION_PRINT_FILE)
            else:
                continue

            print(self.recv())
            continue

if len(sys.argv) != 3:
    print("Usage: python transfer_client.py <host> <port")
    print("Example: python transfer_client.py transfer 1334")
    exit(1)

client = Client(sys.argv[1], sys.argv[2])
client.connect()
