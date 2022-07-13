package Models;

public class ValidationResult {


    private String value;
    private String errorText;

    public ValidationResult(String value, String errorText) {
        this.value = value;
        this.errorText = errorText;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "value='" + value + '\'' +
                ", errorText='" + errorText + '\'' +
                '}';
    }

//    private String BirthPlace;
//
//    private String BirthPlaceNumbersErrorMessage = "Цифры вместо букв в поле";
//    private String BirthPlaceLatinLettersErrorMessage = "Латиница в поле";
//    private String BirthPlaceLatinLettersAndNumbersErrorsMessage ="Латиница и цифры в поле";
//    private String BirthPlaceEmptyErrorMessage = "Пустые поля";
//    private String BirthPlaceSymbolsErrorMessage = 	"Поле содержит символ \"-\"";
//
//    private String Location1;
//    private String Location1NumbersErrorMessage = "Цифры вместо букв в поле";
//    private String Location1LatinLettersErrorMessage = "Латиница в поле";
//    private String Location1EmptyErrorMessage = "Пустые поля";
//    private String Location1SymbolsErrorMessage = "Поле содержит символ \"-\"";
//
//    private String Street1;
//    private String Street1LatinLettersErrorMessage = "Латиница в поле";
//    private String Street1EmptyErrorMessage = "Пустые поля";
//    private String Street1SymbolsErrorMessage = "Поле содержит символ \"-\"";
//
//    private String DateAccountRating;
//    private String DateAccountRatingDataReportedErrorMessage = "Не относятся к одному месяцу 9 и 10 поля TR (ARDRD)";
//
//    private String SegmentTagTR;
//    private String SegmentTagTREmptyErrorMessage = "Нет значения TR (возможно смещение или отсутствие)";
//
//    private String PhoneNumber;
//    private String PhoneNumberErrorMessage = "Неполный номер телефона";

}
