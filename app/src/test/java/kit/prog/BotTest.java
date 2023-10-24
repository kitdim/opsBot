package kit.prog;

import kit.prog.setting.BotConfig;
import kit.prog.setting.ItSupportConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BotTest {
    public static String botName;
    public static String token;
    public static String idGroup;

    @BeforeAll
    public static void init() {
        botName = BotConfig.BOT_NAME;
        token = BotConfig.TOKEN;
        idGroup = ItSupportConfig.ID_GROUP;
    }
}
