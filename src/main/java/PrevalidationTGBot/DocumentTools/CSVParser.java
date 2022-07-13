package PrevalidationTGBot.DocumentTools;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVParser {


    public List<String[]> csvParser(File localFile) {

        List<String[]> list = null;

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(localFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("FILE NOT FOUND");
        }

        try {
            list = reader.readAll();
        }  catch (CsvException e) {
            e.printStackTrace();
            logger.info("CSV READER ERROR");
        }catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("PARSE CSV FROM FILE");

        list.remove(0);
        return list;
    }

    private static  final Logger logger = LogManager.getLogger(CSVParser.class);
}
