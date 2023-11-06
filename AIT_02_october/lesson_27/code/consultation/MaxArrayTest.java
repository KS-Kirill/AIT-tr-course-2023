package consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArrayTest {
    //поле класса
    MaxArray maxOfArray;

    @BeforeEach
    void setUp() {
        maxOfArray = new MaxArray();
    }

    @Test
    void maxOfArray() {
        int[] arr = {500, 500, 500,500, 500, 500, 500};
        assertEquals(0, maxOfArray.maxOfArray(arr));


    }
}