package practice.arrays.test;

import org.junit.jupiter.api.BeforeEach;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class DateSortTestTest {
    Comparator <String> comparator;

   @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            //todo homework
            return 0;
        };
    }

}