#!/usr/bin/env python
# coding=utf-8

import requests
from bs4 import BeautifulSoup
import pymysql

print('连接到mysql服务器...')
conn = pymysql.connect(host="127.0.0.1",port=3306,user="root",passwd="1234",db="test",charset="utf8")
print('连接上了!')
cursor = conn.cursor()
cursor.execute("DROP TABLE IF EXISTS COLOR")
sql = """CREATE TABLE COLOR (
        Color CHAR(20) NOT NULL,
        Value CHAR(10),
        Style CHAR(50) )"""

cursor.execute(sql)

hdrs = {'User-Agent':'Mozilla/5.0 (X11; Fedora; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko)'}

url = "http://html-color-codes.info/color-names/"

r = requests.get(url, headers = hdrs)
soup = BeautifulSoup(r.content.decode('gbk', 'ignore'), 'lxml')
trs = soup.find_all('tr')   # 获取全部tr标签成为一个列表
for tr in trs:              # 遍历列表里所有的tr标签单项
    style = tr.get('style') # 获取每个tr标签里的属性style
    tds = tr.find_all('td') # 将每个tr标签下的td标签获取为列表
    td = [x for x in tds]   # 获取的列表
    name = td[1].text.strip()       # 直接从列表里取值
    hex = td[2].text.strip()
    # print u'颜色: ' + name + u'颜色值: '+ hex + u'背景色样式: ' + style
    # print 'color: ' + name + '\tvalue: '+ hex + '\tstyle: ' + style
    insert_color = ("INSERT INTO COLOR(Color,Value,Style)" "VALUES(%s,%s,%s)")
    data_color = (name, hex, style)
    cursor.execute(insert_color, data_color)
    conn.commit()
    # print '******完成此条插入!' 

print ('爬取数据并插入mysql数据库完成...')