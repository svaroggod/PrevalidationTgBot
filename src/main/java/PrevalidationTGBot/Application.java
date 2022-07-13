package PrevalidationTGBot;

import PrevalidationTGBot.Bot.PrevalidationTG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class Application {    // бот регистрируется в сети

    private  static final Logger logger = LogManager.getLogger(Application.class);


    public static void main(String[] args) {

        Config config= new Config();

        ApiContextInitializer.init();
        logger.info("START");

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi();
            botsApi.registerBot(new PrevalidationTG(config.getBOT_TOKEN(), config.getBOT_USERNAME()));
            logger.info("BOT IS RUNNING");

        } catch (TelegramApiException e) {
            logger.info("BOT REGISTRATION ERROR");
        }
    }
}



