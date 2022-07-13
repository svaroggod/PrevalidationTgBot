package PrevalidationTGBot.DocumentTools;

import PrevalidationTGBot.Models.ValidationReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;


public class ExcelBuilder {  //   класс для создания Exel файла


    public File createXLSX(List<ValidationReport> list) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(birthPlaceError);

        Row row = sheet.createRow(0);
        Cell cell0 = row.createCell(0);
        cell0.setCellValue(number);
        Cell cell1 = row.createCell(1);
        cell1.setCellValue(date);
        Cell cell2 = row.createCell(2);
        cell2.setCellValue(surname);
        Cell cell3 = row.createCell(3);
        cell3.setCellValue(name);
        Cell cell4 = row.createCell(4);
        cell4.setCellValue(fathersName);
        Cell cell5 = row.createCell(5);
        cell5.setCellValue(error);
        Cell cell6 = row.createCell(6);
        cell6.setCellValue(errorType);

        int rownum = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getBirthPlace().getErrorText() != null) {
                    row = sheet.createRow(rownum++);
                    cell0 = row.createCell(0);
                    cell0.setCellValue(user.getAccountNumber());
                    cell1 = row.createCell(1);
                    cell1.setCellValue(user.getDateAccountOpened());
                    cell2 = row.createCell(2);
                    cell2.setCellValue(user.getSurname());
                    cell3 = row.createCell(3);
                    cell3.setCellValue(user.getFirstName());
                    cell4 = row.createCell(4);
                    cell4.setCellValue(user.getPatronymicName());
                    cell5 = row.createCell(5);
                    cell5.setCellValue(user.getBirthPlace().getValue());
                    cell6 = row.createCell(6);
                    cell6.setCellValue(user.getBirthPlace().getErrorText());
                }
            }
        } catch (NullPointerException e) {
        }

        XSSFSheet sheet2 = workbook.createSheet(locationError);
        Row sheet2Row = sheet2.createRow(0);
        Cell cell7 = sheet2Row.createCell(0);
        cell7.setCellValue(number);
        Cell cell8 = sheet2Row.createCell(1);
        cell8.setCellValue(date);
        Cell cell9 = sheet2Row.createCell(2);
        cell9.setCellValue(surname);
        Cell cell10 = sheet2Row.createCell(3);
        cell10.setCellValue(name);
        Cell cell11 = sheet2Row.createCell(4);
        cell11.setCellValue(fathersName);
        Cell cell12 = sheet2Row.createCell(5);
        cell12.setCellValue(error);
        Cell cell13 = sheet2Row.createCell(6);
        cell13.setCellValue(errorType);

        int rownum2 = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getLocation1().getErrorText() != null) {
                    sheet2Row = sheet2.createRow(rownum2++);
                    cell0 = sheet2Row.createCell(0);
                    cell0.setCellValue(user.getAccountNumber());
                    cell1 = sheet2Row.createCell(1);
                    cell1.setCellValue(user.getDateAccountOpened());
                    cell2 = sheet2Row.createCell(2);
                    cell2.setCellValue(user.getSurname());
                    cell3 = sheet2Row.createCell(3);
                    cell3.setCellValue(user.getFirstName());
                    cell4 = sheet2Row.createCell(4);
                    cell4.setCellValue(user.getPatronymicName());
                    cell5 = sheet2Row.createCell(5);
                    cell5.setCellValue(user.getLocation1().getValue());
                    cell6 = sheet2Row.createCell(6);
                    cell6.setCellValue(user.getLocation1().getErrorText());
                }
            }
        } catch (NullPointerException o) {
        }

        XSSFSheet sheet3 = workbook.createSheet(streetError);
        Row sheet3Row = sheet3.createRow(0);
        Cell cell14 = sheet3Row.createCell(0);
        cell14.setCellValue(number);
        Cell cell15 = sheet3Row.createCell(1);
        cell15.setCellValue(date);
        Cell cell16 = sheet3Row.createCell(2);
        cell16.setCellValue(surname);
        Cell cell17 = sheet3Row.createCell(3);
        cell17.setCellValue(name);
        Cell cell18 = sheet3Row.createCell(4);
        cell18.setCellValue(fathersName);
        Cell cell19 = sheet3Row.createCell(5);
        cell19.setCellValue(error);
        Cell cell20 = sheet3Row.createCell(6);
        cell20.setCellValue(errorType);

        int rownum3 = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getStreet1().getErrorText() != null) {
                    sheet3Row = sheet3.createRow(rownum3++);
                    cell14 = sheet3Row.createCell(0);
                    cell14.setCellValue(user.getAccountNumber());
                    cell15 = sheet3Row.createCell(1);
                    cell15.setCellValue(user.getDateAccountOpened());
                    cell16 = sheet3Row.createCell(2);
                    cell16.setCellValue(user.getSurname());
                    cell17 = sheet3Row.createCell(3);
                    cell17.setCellValue(user.getFirstName());
                    cell18 = sheet3Row.createCell(4);
                    cell18.setCellValue(user.getPatronymicName());
                    cell19 = sheet3Row.createCell(5);
                    cell19.setCellValue(user.getStreet1().getValue());
                    cell20 = sheet3Row.createCell(6);
                    cell20.setCellValue(user.getStreet1().getErrorText());
                }
            }
        } catch (NullPointerException o) {
        }

        XSSFSheet sheet4 = workbook.createSheet(dataError);
        Row sheet4Row = sheet4.createRow(0);
        Cell cell21 = sheet4Row.createCell(0);
        cell21.setCellValue(number);
        Cell cell22 = sheet4Row.createCell(1);
        cell22.setCellValue(date);
        Cell cell23 = sheet4Row.createCell(2);
        cell23.setCellValue(surname);
        Cell cell24 = sheet4Row.createCell(3);
        cell24.setCellValue(name);
        Cell cell25 = sheet4Row.createCell(4);
        cell25.setCellValue(fathersName);
        Cell cell26 = sheet4Row.createCell(5);
        cell26.setCellValue(error);
        Cell cell27 = sheet4Row.createCell(6);
        cell27.setCellValue(errorType);

        int rownum4 = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getDateAccountRating().getErrorText() != null) {
                    sheet4Row = sheet4.createRow(rownum4++);
                    cell21 = sheet4Row.createCell(0);
                    cell21.setCellValue(user.getAccountNumber());
                    cell22 = sheet4Row.createCell(1);
                    cell22.setCellValue(user.getDateAccountOpened());
                    cell23 = sheet4Row.createCell(2);
                    cell23.setCellValue(user.getSurname());
                    cell24 = sheet4Row.createCell(3);
                    cell24.setCellValue(user.getFirstName());
                    cell25 = sheet4Row.createCell(4);
                    cell25.setCellValue(user.getPatronymicName());
                    cell26 = sheet4Row.createCell(5);
                    cell26.setCellValue(user.getDateAccountRating().getValue());
                    cell27 = sheet4Row.createCell(6);
                    cell27.setCellValue(user.getDateAccountRating().getErrorText());
                }
            }
        } catch (NullPointerException o) {
        }

        XSSFSheet sheet5 = workbook.createSheet(segmentError);
        Row sheet5Row = sheet5.createRow(0);
        Cell cell28 = sheet5Row.createCell(0);
        cell28.setCellValue(number);
        Cell cell29 = sheet5Row.createCell(1);
        cell29.setCellValue(date);
        Cell cell30 = sheet5Row.createCell(2);
        cell30.setCellValue(surname);
        Cell cell31 = sheet5Row.createCell(3);
        cell31.setCellValue(name);
        Cell cell32 = sheet5Row.createCell(4);
        cell32.setCellValue(fathersName);
        Cell cell33 = sheet5Row.createCell(5);
        cell33.setCellValue(error);
        Cell cell34 = sheet5Row.createCell(6);
        cell34.setCellValue(errorType);

        int rownum5 = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getSegmentTagTR().getErrorText() != null) {
                    sheet5Row = sheet5.createRow(rownum5++);
                    cell28 = sheet5Row.createCell(0);
                    cell28.setCellValue(user.getAccountNumber());
                    cell29 = sheet5Row.createCell(1);
                    cell29.setCellValue(user.getDateAccountOpened());
                    cell30 = sheet5Row.createCell(2);
                    cell30.setCellValue(user.getSurname());
                    cell31 = sheet5Row.createCell(3);
                    cell31.setCellValue(user.getFirstName());
                    cell32 = sheet5Row.createCell(4);
                    cell32.setCellValue(user.getPatronymicName());
                    cell33 = sheet5Row.createCell(5);
                    cell33.setCellValue(user.getSegmentTagTR().getValue());
                    cell34 = sheet5Row.createCell(6);
                    cell34.setCellValue(user.getSegmentTagTR().getErrorText());
                }
            }
        } catch (NullPointerException o) {
        }

        XSSFSheet sheet6 = workbook.createSheet(phoneError);
        Row sheet6Row = sheet6.createRow(0);
        Cell cell35 = sheet6Row.createCell(0);
        cell35.setCellValue(number);
        Cell cell36 = sheet6Row.createCell(1);
        cell36.setCellValue(date);
        Cell cell37 = sheet6Row.createCell(2);
        cell37.setCellValue(surname);
        Cell cell38 = sheet6Row.createCell(3);
        cell38.setCellValue(name);
        Cell cell39 = sheet6Row.createCell(4);
        cell39.setCellValue(fathersName);
        Cell cell40 = sheet6Row.createCell(5);
        cell40.setCellValue(error);
        Cell cell41 = sheet6Row.createCell(6);
        cell41.setCellValue(errorType);

        int rownum6 = 1;

        try {
            for (ValidationReport user : list) {
                if (user.getPhoneNumber().getErrorText() != null) {
                    sheet6Row = sheet6.createRow(rownum6++);
                    cell11 = sheet6Row.createCell(0);
                    cell11.setCellValue(user.getAccountNumber());
                    cell11 = sheet6Row.createCell(1);
                    cell11.setCellValue(user.getDateAccountOpened());
                    cell11 = sheet6Row.createCell(2);
                    cell11.setCellValue(user.getSurname());
                    cell11 = sheet6Row.createCell(3);
                    cell11.setCellValue(user.getFirstName());
                    cell11 = sheet6Row.createCell(4);
                    cell11.setCellValue(user.getPatronymicName());
                    cell11 = sheet6Row.createCell(5);
                    cell11.setCellValue(user.getPhoneNumber().getValue());
                    cell11 = sheet6Row.createCell(6);
                    cell11.setCellValue(user.getPhoneNumber().getErrorText());
                }
            }
        } catch (NullPointerException o) {
            logger.error("Ошибка во время формирования XML файла");
        }

         File newFile= creeateXlsFile();

        try (OutputStream stream = new FileOutputStream(newFile)) {
            workbook.write(stream);

        } logger.info("CREATE XLS FILE");
        return newFile;
    }


    public File creeateXlsFile () {
        String fileName = ("listresult.xlsx");
        String path = "src/main/java/downloaded/";
        File file = new File(path, fileName);
        return file;
    }


    final String number= "Номер договора";
    final String date= "Дата выдачи договора";
    final String surname = "Фамилия";
    final String name= "Имя";
    final String fathersName= "Отчество";
    final String error= "Ошибка в поле";
    final String errorType= "Вид ошибки";

    final String birthPlaceError= "BirthPlace Errors";
    final String locationError= "Location1 Errors";
    final String streetError= "Street1 Errors";
    final String dataError= "DataAccountRating Errors";
    final String segmentError= "SegmentTagTR Errors";
    final String phoneError= "PhoneNumber Errors";

     Logger logger = LogManager.getLogger(ExcelBuilder.class);
}
