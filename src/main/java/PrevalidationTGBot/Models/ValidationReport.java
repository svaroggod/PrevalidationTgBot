package PrevalidationTGBot.Models;

public class ValidationReport {

    //Постоянные поля
    private String accountNumber;
    private String dateAccountOpened;
    private String surname;
    private String firstName;
    private String patronymicName;
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
        this.accountNumber = accountNumber;
        this.dateAccountOpened = dateAccountOpened;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.birthPlace = birthPlace;
        this.location1 = location1;
        this.street1 = street1;
        this.dateAccountRating = dateAccountRating;
        this.segmentTagTR = segmentTagTR;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getDateAccountOpened() {
        return dateAccountOpened;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymicName() {
        return patronymicName;
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

    public ValidationResult getSegmentTagTR() {return segmentTagTR;}

    public ValidationResult getPhoneNumber() {return phoneNumber;}

    @Override
    public String toString() {
        return "ValidationReport{" +
                "AccountNumber='" + accountNumber + '\'' +
                ", DateAccountOpened='" + dateAccountOpened + '\'' +
                ", Surname='" + surname + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", PatronymicName='" + patronymicName + '\'' +
                ", birthPlace=" + birthPlace +
                ", location1=" + location1 +
                ", street1=" + street1 +
                ", dateAccountRating=" + dateAccountRating +
                ", segmentTagTR=" + segmentTagTR +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
