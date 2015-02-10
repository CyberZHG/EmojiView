categories = ['people', 'places', 'nature', 'objects', 'symbols']
with open('list.java', 'w') as write:
    for category in categories:
        num = 0
        first = True
        write.write(category + 'List = new long[] {\n\t')
        with open(category + '.list', 'r') as read:
            for line in read.readlines():
                items = map(lambda x: x[2:].lower(), line[:-1].split(' '))
                if first:
                    first = False
                else:
                    write.write(', ')
                if num >= 7:
                    write.write('\n\t')
                    num = 0
                if len(items) == 1:
                    write.write('0x' + items[0] + 'L')
                    num += 1
                else:
                    write.write('(0x' + items[0] + 'L << 32) | 0x' + items[1] + 'L')
                    num += 5
        write.write('\n};\n\n')
    write.write('int num = all.size();\n')
    write.write('allList = new long[num];\n')
    write.write('int index = 0;\n\n')
    for category in categories:
        write.write('for (int i = 0; i < ' + category + 'List.length; ++i, ++index) {\n')
        write.write('\tallList[index] = ' + category + 'List[i];\n')
        write.write('}\n')
                    
            