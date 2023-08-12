import telebot

TOKEN = 'тут указывается токен от BotFather'
ADMIN_ID = 'тут id пользователя телегамм или группы'

bot = telebot.TeleBot(TOKEN)

name = None
username = None
user1_mess = None
user2_mess = None
user3_mess = None


@bot.message_handler(commands=['start'])
def start_message(message):
    global name, username
    name = message.from_user.first_name
    username = message.from_user.username
    bot.send_message(message.chat.id, "Здравствуйте! Это бот для заявок. Чтобы подать заявку, заполните анкету")
    form1(message)


def form1(message):
    bot.send_message(message.chat.id, "1. Какой номер отделения?")
    bot.register_next_step_handler(message, form2)

def form2(message):
    global user1_mess
    user1_mess = message.text
    bot.send_message(message.chat.id, "2. Какая проблема?")
    bot.register_next_step_handler(message, form3)

def form3(message):
    global user2_mess
    user2_mess = message.text
    bot.send_message(message.chat.id, "3. Укажите номер телефона:")
    bot.register_next_step_handler(message, result)

def result(message):
    global user3_mess
    user3_mess = message.text
    bot.send_message(message.chat.id, "Спасибо за заявку! Скоро мы свяжемся с вами. Всего доброго!")
    admin_app(ADMIN_ID)

def admin_app(ADMIN_ID):
    ankets = f'''Новая заявка от {name}!
ОПС: {user1_mess}
Проблема: {user2_mess}
Номер телефона: {user3_mess}

Telegram:
Name: {name}
Username: @{username}'''

    bot.send_message(ADMIN_ID, ankets)

    
bot.polling()
