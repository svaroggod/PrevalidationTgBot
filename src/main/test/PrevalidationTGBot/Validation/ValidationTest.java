package PrevalidationTGBot.Validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidationTest {

    Validation validation=new Validation();
    String x= "Пустые поля";
    String y= "";

    @Test
    void validate() {
    }

    @Test
    void value1Checker() {

assertTrue(x==validation.value1Checker(y));

    }

    @Test
    void value2Checker() {
    }

    @Test
    void value3Checker() {
    }

    @Test
    void value4Checker() {
    }

    @Test
    void value6Checker() {
    }

    @Test
    void value7Checker() {
    }
}