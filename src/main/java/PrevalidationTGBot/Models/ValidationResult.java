package PrevalidationTGBot.Models;

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
}
