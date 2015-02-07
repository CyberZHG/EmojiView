categories = ['people', 'places', 'nature', 'objects', 'symbols']
with open('map.java', 'w') as write:
    for category in categories:
        with open(category + '.list', 'r') as read:
            for line in read.readlines():
                items = map(lambda x: x[2:].lower(), line[:-1].split(' '))
                write.write('all.put(')
                if len(items) == 1:
                    write.write('0x' + items[0] + 'L')
                else:
                    write.write('(0x' + items[0] + 'L << 32) | 0x' + items[1] + 'L')
                write.write(', R.drawable.emoji_')
                write.write('_'.join(items))
                write.write(');\n')
        write.write('\n')
            