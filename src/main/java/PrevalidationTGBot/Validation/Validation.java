package PrevalidationTGBot.Validation;

import PrevalidationTGBot.Models.RowData;
import PrevalidationTGBot.Models.ValidationReport;
import PrevalidationTGBot.Models.ValidationResult;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation implements Validator {

    String value, value2, value3, value4, value5, value6, value7;
    String errorText, errorText2, errorText3, errorText4, errorText5, errorText6;


    @Override
    public ValidationReport validate(RowData rowData) {

        value = rowData.getBirthPlace();
        value2 = rowData.getLocation1();
        value3 = rowData.getStreet1();
        value4 = rowData.getDateAccountRating();
        value5 = rowData.getDateReported();
        value6 = rowData.getSegmentTagTR();
        value7 = rowData.getPhoneNumber();


        errorText = value1Checker(value);
        ValidationResult birthPlace = new ValidationResult("BirthPlace", errorText);

        errorText2 = value2Checker(value2);
        ValidationResult location1 = new ValidationResult("Location1", errorText2);

        errorText3 = value3Checker(value3);
        ValidationResult street1 = new ValidationResult("Street1", errorText3);

        errorText4 = value4Checker(value4, value5);
        ValidationResult dateAccountRating = new ValidationResult("DataAccountRating", errorText4);


        errorText5 = value6Checker(value6);
        ValidationResult segmentTagTR = new ValidationResult("SegmentTagTR", errorText5);

        errorText6 = value7Checker(value7);
        ValidationResult phoneNumber = new ValidationResult("PhoneNumber", errorText6);


        ValidationReport validationReport = new ValidationReport(rowData.getAccountNumber(),
                rowData.getDateAccountOpened(),
                rowData.getSurname(),
                rowData.getFirstName(),
                rowData.getPatronymicName(),
                birthPlace, location1,
                street1, dateAccountRating,
                segmentTagTR, phoneNumber);


        return validationReport;
    }


    String value1Checker(String value) {

        if (value.matches(Validator.latinLettersAndNumbersRegex)) {
            errorText = Validator.latinLettersAndNumbersErrorsMessage;
        } else if (value.matches(Validator.latinLettersRegex)) {
            errorText = Validator.latinLettersErrorMessage;
        } else if (value.matches(Validator.numbersRegex)) {
            errorText = Validator.numbersErrorMessage;
        } else if (value.matches(Validator.symbolsErrorRegex)) {
            errorText = Validator.symbolsErrorMessage;
        } else if (value.isEmpty()) {
            errorText = Validator.emptyErrorMessage;
        } else {
            errorText = null;
        }
        return errorText;
    }


    String value2Checker(String value2) {

        if (value2.matches(symbolsErrorRegex)) {
            errorText2 = Validator.symbolsErrorMessage;
        } else if (value2.matches(numbersErrorMessage)) {
            errorText2 = Validator.numbersErrorMessage;
        } else if (value2.matches(latinLettersRegex)) {
            errorText2 = Validator.latinLettersErrorMessage;
        } else if (value2.isEmpty()) {
            errorText2 = Validator.emptyErrorMessage;
        } else {
            errorText2 = null;
        }

        return errorText2;
    }


    String value3Checker(String value3) {

        if (value3.matches(Validator.symbolsErrorRegex)) {
            errorText3 = Validator.symbolsErrorMessage;
        } else if (value3.matches(Validator.latinLettersRegex)) {
            errorText3 = Validator.latinLettersErrorMessage;
        } else if (value3.isEmpty()) {
            errorText3 = Validator.emptyErrorMessage;
        } else {
            errorText3 = null;
        }
        return errorText3;
    }


    String value4Checker(String value4, String value5) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Date date1 = null;
        try {
            date1 = format.parse(value4);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = null;
        try {
            date2 = format.parse(value5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date1 != null && date2 != null) {
            if (date1.getMonth() != date2.getMonth()) {
                errorText4 = Validator.fieldDifferenceErrorMessage;

            } else {
                errorText4 = null;
            }
        }
        return errorText4;
    }

    String value6Checker(String value6) {

        if (value6.isEmpty()) {
            errorText5 = Validator.segmentTagTREmptyErrorMessage;
        } else {
            errorText5 = null;
        }
        return errorText5;
    }


    String value7Checker(String value7) {


        if (value7.length() != 11) {
            errorText6 = Validator.phoneNumberErrorMessage;
        } else {
            errorText6 = null;
        }
        return errorText6;
    }

}