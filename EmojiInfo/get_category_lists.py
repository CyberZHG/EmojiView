map = {}
with open('encode.list', 'r') as f:
    for line in f.readlines():
        items = line[:-1].split(' ')
        map[items[-1].lower()] = ' '.join(items[:-1])
print(len(map))

categories = ['people', 'places', 'nature', 'objects', 'symbols']
num = 0
for category in categories:
    print category
    with open(category + '.list', 'w') as w:
        with open(category + '.utf8', 'rb') as f:
            byte = f.read(1)
            while True:
                bytes = ''
                while byte != '' and byte != '\n':
                    bytes += "\\x%02x" % ord(byte)
                    byte = f.read(1)
                if bytes == '':
                    break
                w.write(map[bytes] + '\n')
                map.pop(bytes, None)
                num += 1
                byte = f.read(1)
print map