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
html = response.read()

print 'Parsing...'
base_url = 'http://apps.timwhitlock.info/static/images/emoji/emoji-apple/'
base_save = './res/drawable-nodpi/'
reg = re.compile(r'<img class="emoji" data-src="/static/images/emoji/emoji-apple/(.*?)" />')
names = re.findall(reg, html)

print 'Downloading...'
index = 0
for name in names:
    index += 1
    print '[' + str(index) + '/' + str(len(names)) + '] ' + name
    url = base_url + name
    save_path = base_save + 'emoji_' + name.replace('-', '_')
    request = urllib2.Request(url, headers=headers)
    response = urllib2.urlopen(request)
    data = response.read()
    with open(save_path, 'wb') as f:
        f.write(data)