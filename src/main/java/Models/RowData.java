package Models;

public class RowData {

    //Постоянные поля
    private String AccountNumber;
    private String DateAccountOpened;
    private String Surname;
    private String FirstName;
    private String PatronymicName;

    //Проверяемые поля
    private String BirthPlace;
    private String Location1;
    private String Street1;
    private String DateAccountRating;
    private String DateReported;
    private String SegmentTagTR;
    private String PhoneNumber;

    public RowData(String accountNumber, String dateAccountOpened, String surname, String firstName, String patronymicName, String birthPlace, String location1, String street1, String dateAccountRating, String dateReported, String segmentTagTR, String phoneNumber) {
        AccountNumber = accountNumber;
        DateAccountOpened = dateAccountOpened;
        Surname = surname;
        FirstName = firstName;
        PatronymicName = patronymicName;
        BirthPlace = birthPlace;
        Location1 = location1;
        Street1 = street1;
        DateAccountRating = dateAccountRating;
        DateReported = dateReported;
        SegmentTagTR = segmentTagTR;
        PhoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getDateAccountOpened() {
        return DateAccountOpened;
    }

    public void setDateAccountOpened(String dateAccountOpened) {
        DateAccountOpened = dateAccountOpened;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getPatronymicName() {
        return PatronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        PatronymicName = patronymicName;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        BirthPlace = birthPlace;
    }

    public String getLocation1() {
        return Location1;
    }

    public void setLocation1(String location1) {
        Location1 = location1;
    }

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public String getDateAccountRating() {
        return DateAccountRating;
    }

    public void setDateAccountRating(String dateAccountRating) {
        DateAccountRating = dateAccountRating;
    }

    public String getDateReported() {
        return DateReported;
    }

    public void setDateReported(String dateReported) {
        DateReported = dateReported;
    }

    public String getSegmentTagTR() {
        return SegmentTagTR;
    }

    public void setSegmentTagTR(String segmentTagTR) {
        SegmentTagTR = segmentTagTR;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Models.RowData{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", DateAccountOpened='" + DateAccountOpened + '\'' +
                ", Surname='" + Surname + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", PatronymicName='" + PatronymicName + '\'' +
                ", BirthPlace='" + BirthPlace + '\'' +
                ", Location1='" + Location1 + '\'' +
                ", Street1='" + Street1 + '\'' +
                ", DateAccountRating='" + DateAccountRating + '\'' +
                ", DateReported='" + DateReported + '\'' +
                ", SegmentTagTR='" + SegmentTagTR + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }


}

