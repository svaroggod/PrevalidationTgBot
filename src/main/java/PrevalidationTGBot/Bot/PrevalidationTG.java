package PrevalidationTGBot.Bot;

import PrevalidationTGBot.Config;
import PrevalidationTGBot.DocumentTools.CSVParser;
import PrevalidationTGBot.DocumentTools.ExcelBuilder;

import PrevalidationTGBot.Models.ConvertToModel;
import PrevalidationTGBot.Models.RowData;
import PrevalidationTGBot.Models.ValidationReport;
import PrevalidationTGBot.Validation.Validation;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Flag;
import org.telegram.abilitybots.api.objects.Locality;
import org.telegram.abilitybots.api.objects.Privacy;
import org.telegram.telegrambots.api.methods.GetFile;
import org.telegram.telegrambots.api.methods.send.SendDocument;
import org.telegram.telegrambots.api.objects.Document;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrevalidationTG extends AbilityBot {


Config config=new Config();

    public PrevalidationTG(String  botToken, String botUsername) {

        super(botToken, botUsername);
    }

    public int creatorId() {
        return config.getCREATOR_ID();
    }

    public Ability sayHello() {
        return Ability.builder().name("hello").info("says hello ").locality(Locality.ALL).privacy(Privacy.PUBLIC).action((ctx) -> {
            this.silent.send("Hello", ctx.chatId());
        }).build();
    }

    public boolean checkGlobalFlags(Update update) {
        return true;
    }

    public Ability ParsingAbility() {
        return Ability.builder().name("default").flag(new Predicate[]{Flag.DOCUMENT}).privacy(Privacy.PUBLIC).
                locality(Locality.ALL).input(0).action((ctx) -> {

            File newFile = null;
            Document doc = ctx.update().getMessage().getDocument();
            File localFile = this.downloadFile(doc);
            this.silent.send("Документ получен", ctx.chatId());
            logger.info("GET FILE");
            CSVParser parser= new CSVParser();
            List<String[]> csvResult = parser.csvParser(localFile);
            List<RowData> result;
            ValidationReport result2;
            List<ValidationReport> list = new ArrayList<>();
            Validation validation = new Validation();

            try {
                result = ConvertToModel.getInfoByCSV(csvResult);
                for (RowData rowData : result) {
                    result2 = validation.validate(rowData);
                    list.add(result2);
                }

                ExcelBuilder excelBuilder= new ExcelBuilder();
                excelBuilder.createXLSX(list);

            } catch (IOException var11) {
                this.silent.send("Ошибка в полученных данных", ctx.chatId());
            }

            SendDocument sendDoc = new SendDocument();
            sendDoc.setChatId(ctx.chatId());
            File localFileXLSX = new File("src/main/java/downloaded/listresult.xlsx");
            sendDoc.setNewDocument(localFileXLSX);

            try {
                this.sendDocument(sendDoc);
            } catch (TelegramApiException var10) {
                logger.error("FILE SENDING FAILED");
            }
            localFile.delete();

        }).build();
    }

    public File downloadFile(Document doc) {
        try {
            String uploadedFileId = doc.getFileId();
            GetFile uploadedFile = new GetFile();
            uploadedFile.setFileId(uploadedFileId);
            String fileName = doc.getFileName();
            String uploadedFilePath = this.getFile(uploadedFile).getFilePath();
            File localFile = new File("src/main/java/downloaded/" + fileName);
            String url = String.format("https://api.telegram.org/file/bot%s/%s", config.getBOT_TOKEN(), uploadedFilePath);
            InputStream is = (new URL(url)).openStream();
            FileUtils.copyInputStreamToFile(is, localFile);
            return localFile;

        } catch (IOException | TelegramApiException var9) {
            var9.printStackTrace();
            logger.error("ERROR BY DOWNLOADING FILE FROM CHAT");
            return null;
        }
    }

     Logger logger = LogManager.getLogger(ExcelBuilder.class);
}
