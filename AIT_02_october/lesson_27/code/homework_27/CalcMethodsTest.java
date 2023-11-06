package homework_27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcMethodsTest {

    CalcMethods calcMethods;

    @BeforeEach
    void setUp() {
        calcMethods = new CalcMethods();
    }

    @Test
    void sumTest() {
        int a = 27;
        int b = 75;
        assertEquals(102, calcMethods.sum(27, 75));

    }

    @Test
    void difTest() {
        int a = 53;
        int b = 35;
        assertEquals(18,calcMethods.dif(53, 35));
    }

    @Test
    void divTest() {
        int a = 75;
        int b = 5;
        assertEquals(15, calcMethods.div(75, 5));
    }

    @Test
    void multiplicationTest() {
        int a = 23;
        int b = 12;
        assertEquals(276, calcMethods.multiplication(23, 12));
    }

}