package practice.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.arrays.utilits.ArrayTools;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {

    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @Test
    void testPrintArray() {
        System.out.println("======testPrintArray=====");
        ArrayTools.prinArray(arrNum);
        ArrayTools.prinArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("=======testSearch=======");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("========testFindByPredicate========");
        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);

    }

    @Test
    void testBubbleSort() {
        System.out.println("=====testBubbleSort=====");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.prinArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.prinArray(arrStr);
    }
    @Test
    void testBubbleSortComparator() {
        System.out.println("=====testBubbleSortComparator=====");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 - n1);
        ArrayTools.prinArray(arrNum);
        ArrayTools.bubbleSort(arrStr, (s1,s2) -> s1.length() - s2.length());
        ArrayTools.prinArray(arrStr);
    }
}
