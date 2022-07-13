package PrevalidationTGBot.Models;

public class RowData {

    //Постоянные поля
    private String accountNumber;
    private String dateAccountOpened;
    private String surname;
    private String firstName;
    private String patronymicName;
    //Проверяемые поля
    private String birthPlace;
    private String location1;
    private String street1;
    private String dateAccountRating;
    private String dateReported;
    private String segmentTagTR;
    private String phoneNumber;

    public RowData(String accountNumber, String dateAccountOpened, String surname, String firstName,
                   String patronymicName, String birthPlace, String location1, String street1, String dateAccountRating,
                   String dateReported, String segmentTagTR, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.dateAccountOpened = dateAccountOpened;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.birthPlace = birthPlace;
        this.location1 = location1;
        this.street1 = street1;
        this.dateAccountRating = dateAccountRating;
        this.dateReported = dateReported;
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

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getLocation1() {
        return location1;
    }

    public String getStreet1() {
        return street1;
    }

    public String getDateAccountRating() {
        return dateAccountRating;
    }

    public String getDateReported() {
        return dateReported;
    }

    public String getSegmentTagTR() {
        return segmentTagTR;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PrevalidationTG.Models.RowData{" +
                "AccountNumber='" + accountNumber + '\'' +
                ", DateAccountOpened='" + dateAccountOpened + '\'' +
                ", Surname='" + surname + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", PatronymicName='" + patronymicName + '\'' +
                ", BirthPlace='" + birthPlace + '\'' +
                ", Location1='" + location1 + '\'' +
                ", Street1='" + street1 + '\'' +
                ", DateAccountRating='" + dateAccountRating + '\'' +
                ", DateReported='" + dateReported + '\'' +
                ", SegmentTagTR='" + segmentTagTR + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}

