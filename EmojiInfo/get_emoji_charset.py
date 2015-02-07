import re
import time
import socket
import urllib2

print 'Requesting...'
socket.setdefaulttimeout(30)
url = 'http://apps.timwhitlock.info/emoji/tables/unicode/'
user_agent = 'Mozilla/4.0 (compatible; MSIE 5.5; Windows NT)'
headers = {'User-Agent' : user_agent}
request = urllib2.Request(url, headers=headers)
response = urllib2.urlopen(request)
html = response.read().replace('\n', '')

print 'Parsing...'
rowRegex = re.compile(r'<tr id="emoji-.*?" class=".*?">(.*?)</tr>')
unicodeRegex = re.compile(r'<a href="/unicode/inspect/hex/.*?">(.*?)</a>')
bytesRegex = re.compile(r'<td class="code">(.*?)</td>')
rows = re.findall(rowRegex, html)

with open('encode.list', 'w') as f:
    for row in rows:
        unicode = re.findall(unicodeRegex, row)[0]
        bytes = re.findall(bytesRegex, row)[1]
        print unicode, bytes
        f.write(unicode + ' ' + bytes + '\n')
        
    
