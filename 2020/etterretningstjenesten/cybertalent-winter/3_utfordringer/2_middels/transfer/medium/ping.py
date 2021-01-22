#!/usr/bin/env python3

from Crypto.Cipher import ARC4

import time
import socket
import struct
import base64

instructions = {
    "connect": 0,
    "authenticate": 1,
    "okay": 2,
    "ls": 3,
    "cd": 4,
    "setFile": 5,
    "read": 6,
    "write": 7,
    "disconnect": 8,
    "connectOkay": 9,
    "symmKey": 10,
    "setCipher": 11,
    "success": 12,
    "failure": 13,
    "noOp": 14,
}

instructions_inv = {num: text for (text, num) in instructions.items()}


def make_packet(seq, instr, msg):
    b64_msg = base64.b64encode(msg)

    data = b"FILE"
    data += struct.pack(">Q", seq)
    data += struct.pack(">B", instructions[instr])
    data += struct.pack(">Q", len(b64_msg))
    data += b64_msg

    return data


def parse_packet(pkt):
    assert pkt[:4] == b"FILE"
    hdr_len = 4 + 8 + 1 + 8

    seq, instr, b64_len = struct.unpack(">QBQ", pkt[4:hdr_len])
    msg = base64.b64decode(pkt[hdr_len : hdr_len + b64_len])
    return msg, seq, instr


def print_packet(pkt):
    msg, seq, instr = parse_packet(pkt)
    return f"{instructions_inv[instr]} | {msg} | {seq}"


class Client:
    @staticmethod
    def setup(addr, debug=False):
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.connect(addr)

        # Make packet and send
        p = make_packet(0, "connect", b"")
        s.send(p)
        if debug:
            print(f"sending: {print_packet(p)}")

        # Recv and parse packet
        r = s.recv(4096)
        pr = parse_packet(r)
        if debug:
            print(f"got: {print_packet(r)}\n")

        # Make and send packet
        p1 = make_packet(pr[1], "authenticate", b"guest:guest")
        s.send(p1)
        if debug:
            print(f"sending: {print_packet(p1)}")

        # Recv and parse packet
        r = s.recv(4096)
        pr = parse_packet(r)
        if debug:
            print(f"got: {print_packet(r)}\n")
        symm_key = pr[0]

        # Make and send packet
        p = make_packet(pr[1], "okay", b"")
        s.send(p)
        if debug:
            print(f"sending: {print_packet(p)}")

        # Recv and parse packet
        r = s.recv(4096)
        pr = parse_packet(r)
        if debug:
            print(f"got: {print_packet(r)}\n")
        if instructions_inv[pr[2]] == "setCipher":
            return ARC4.new(symm_key), s, pr[1]

    def __init__(self, addr):
        cipher, sock, seq = Client.setup(addr)
        self.cipher = cipher
        self.sock = sock
        self.seq = seq

    def ls(self):
        self.sock.send(make_packet(self.seq, "ls", b""))
        r = self.sock.recv(4096)
        packet = parse_packet(r)
        self.seq = packet[1]
        plain = self.cipher.decrypt(packet[0])
        if instructions_inv[packet[2]] == "success":
            return plain.decode()

    def cd(self, path):
        self.sock.send(make_packet(self.seq, "cd", self.cipher.encrypt(path)))
        r = self.sock.recv(4096)
        packet = parse_packet(r)
        self.seq = packet[1]
        plain = self.cipher.decrypt(packet[0])
        if instructions_in
