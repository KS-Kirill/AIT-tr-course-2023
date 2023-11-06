package practice.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.model.City;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("======== " + title + " ========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1));
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCityComparable() {
        printArray(cities, "Original array");
        Arrays.sort(cities);
        printArray(cities, "Natural Order");
        City city = new City("Chicago", 2_700_000);
        //в сравнении compare будет участвовать только int population, название не имеет значения
        int index = Arrays.binarySearch(cities, city);
        System.out.println("index = " + index);
    }

    @Test
    void testCityComparator() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        //функция (объект) которая принимает 2 города и возвращает результат сравнения с1 и с2
        Arrays.sort(cities, comparator);
        printArray(cities, "Sort by name");
    }
    @Test
    void testArrayCopy() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        City[] citiesCopy = cities;
        printArray(citiesCopy, "citiesCopy before Sort");
        Arrays.sort(citiesCopy, comparator);
        printArray(citiesCopy, "citiesCopy after sort");
    }

    @Test
    void testCopyOfRange() {
        City[] citiesCopy = Arrays.copyOfRange(cities, 1, cities.length - 1);
        //функция чтобы отсортировать в рендже (от и до)
        printArray(citiesCopy, "copy of range");
    }

    @Test
    void testSystemArrayCopy() {
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities, 1, citiesCopy, 4, 4);
        printArray(citiesCopy, "testSystemArrayCopy");
    }

    @Test
    void testKeepSorted() {
        Arrays.sort(cities);
        printArray(cities, "Natural Order");
        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities,cities.length + 1);
        citiesCopy[citiesCopy.length - 1] = city;

    }
}