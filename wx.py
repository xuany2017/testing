#!/usr/bin/env python3
# coding: utf-8
from wxpy import *
bot = Bot()
# api可直接用，也可去图灵机器人官网申请
tuling = Tuling(api_key='04e7e24d74734b69a0f514d39e841f1a')
@bot.register(msg_types=TEXT)
def auto_reply_all(msg):
    tuling.do_reply(msg)
bot.join()