categories = ['people', 'places', 'nature', 'objects', 'symbols']
for category in categories:
    with open(category + '.java', 'w') as write:
        with open(category + '.list', 'r') as read:
            for line in read.readlines():
                items = map(lambda x: x[2:].lower(), line[:-1].split(' '))
                write.write(category + '.put(')
                if len(items) == 1:
                    write.write('0x' + items[0])
                else:
                    write.write('(0x' + items[0] + ' << 16) | 0x' + items[1])
                write.write(', R.drawable.emoji_')
                write.write('_'.join(items))
                write.write(');\n')
                    
            