package PrevalidationTGBot.Validation;

import PrevalidationTGBot.Models.RowData;
import PrevalidationTGBot.Models.ValidationReport;

public interface Validator {

    String numbersErrorMessage = "Цифры вместо букв в поле";
    String latinLettersErrorMessage = "Латиница в поле";
    String latinLettersAndNumbersErrorsMessage = "Латиница и цифры в поле";
    String emptyErrorMessage = "Пустые поля";
    String symbolsErrorMessage = "Поле содержит символ \"-\"";
    String fieldDifferenceErrorMessage = "Не относятся к одному месяцу 9 и 10 поля TR (ARDRD)";
    String segmentTagTREmptyErrorMessage = "Нет значения TR (возможно смещение или отсутствие)";
    String phoneNumberErrorMessage = "Неполный номер телефона";

    String latinLettersAndNumbersRegex = ".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*";
    String numbersRegex = ".*\\d+.*";
    String latinLettersRegex = "^[a-zA-Z]+$";
    String symbolsErrorRegex = ".*\"-\".*";

    ValidationReport validate(RowData rowData);
}
