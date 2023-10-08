package kit.prog;

import kit.prog.config.BotConfig;
import kit.prog.config.ItSupportConfig;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            String someText = update.getMessage().getText();
            if (someText.equals("/start")) {
                message.setText("""
                        Добрый день!
                        Чтобы создать заявку заполните форму:
                        1.Номер ОПС:
                        2.Проблема:
                        3.Контактный номер:""");
            } else {
                message.setText("Заявка зарегистрирована, ожидайте с вами свяжутся.");
                sendInSupport(someText, update);
            }
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendInSupport(String someText, Update update) {
        SendMessage message = new SendMessage();
        StringBuilder messageInSupport = new StringBuilder();
        String userName = update.getMessage().getChat().getUserName();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        messageInSupport.append("Заявка от @").append(userName).append("\n");
        messageInSupport.append(dateFormat.format(date)).append("\n");
        messageInSupport.append(someText);

        message.setChatId(ItSupportConfig.ID_GROUP);
        message.setText(messageInSupport.toString());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return BotConfig.BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BotConfig.TOKEN;
    }
}
