package Models;

public class ValidationReport {

    //Постоянные поля
    private String AccountNumber;
    private String DateAccountOpened;
    private String Surname;
    private String FirstName;
    private String PatronymicName;
    private ValidationResult birthPlace;
    private ValidationResult location1;
    private ValidationResult street1;
    private ValidationResult dateAccountRating;
    private ValidationResult segmentTagTR;
    private ValidationResult phoneNumber;

    public ValidationReport(String accountNumber, String dateAccountOpened, String surname,
                            String firstName, String patronymicName, ValidationResult birthPlace,
                            ValidationResult location1, ValidationResult street1, ValidationResult dateAccountRating,
                            ValidationResult segmentTagTR, ValidationResult phoneNumber) {
        AccountNumber = accountNumber;
        DateAccountOpened = dateAccountOpened;
        Surname = surname;
        FirstName = firstName;
        PatronymicName = patronymicName;
        this.birthPlace = birthPlace;
        this.location1 = location1;
        this.street1 = street1;
        this.dateAccountRating = dateAccountRating;
        this.segmentTagTR = segmentTagTR;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getDateAccountOpened() {
        return DateAccountOpened;
    }

    public String getSurname() {
        return Surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getPatronymicName() {
        return PatronymicName;
    }

    public ValidationResult getBirthPlace() {
        return birthPlace;
    }

    public ValidationResult getLocation1() {
        return location1;
    }

    public ValidationResult getStreet1() {
        return street1;
    }

    public ValidationResult getDateAccountRating() {
        return dateAccountRating;
    }

    public ValidationResult getSegmentTagTR() {
        return segmentTagTR;
    }

    public ValidationResult getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ValidationReport{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", DateAccountOpened='" + DateAccountOpened + '\'' +
                ", Surname='" + Surname + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", PatronymicName='" + PatronymicName + '\'' +
                ", birthPlace=" + birthPlace +
                ", location1=" + location1 +
                ", street1=" + street1 +
                ", dateAccountRating=" + dateAccountRating +
                ", segmentTagTR=" + segmentTagTR +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
