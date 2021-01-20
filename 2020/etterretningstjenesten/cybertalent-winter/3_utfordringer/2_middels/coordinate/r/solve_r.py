from PIL import Image

image = Image.open("full_red.png")

pixels = {}

for x in range(image.size[0]):
    for y in range(image.size[1]):
        p = image.getpixel((x, y))
        if p != 0:
            print(x, y, sep="\t")
            pixels[y] = x

exit(0)
pixels = dict(sorted(pixels.items()))
print("Flag:", "".join([chr(x) for x in pixels.values()]))
#print(chr(x))
