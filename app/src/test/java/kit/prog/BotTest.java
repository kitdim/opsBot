package kit.prog;

import kit.prog.config.BotConfig;
import kit.prog.config.ItSupportConfig;
import org.junit.jupiter.api.BeforeAll;

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
