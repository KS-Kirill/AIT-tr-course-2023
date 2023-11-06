package homework_39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    String birthDate = "1988-02-17";
    int expectedAge = 35;

    @Test
    void getAge() {
        int actualAge = DateOperation.getAge(birthDate);
        assertEquals(expectedAge, actualAge);
        System.out.println(actualAge);
    }

    @Test
    void sortStringDates() {
        String[] unsortedDates = {"2023-10-31", "1990-05-15", "2000-12-31", "1986-01-23", "2012-10-24"};
        String[] sortedDates = DateOperation.sortStringDates(unsortedDates);
        System.out.println(Arrays.toString(sortedDates));
    }
}