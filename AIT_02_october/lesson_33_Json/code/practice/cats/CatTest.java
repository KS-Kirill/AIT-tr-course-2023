package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    //в тесте сначала подключаем класс или массив который будем тестировать
    Cat[] cat; //создали для этих целей массив

    @BeforeEach
    void setUp() {
        cat = new Cat[4];
        cat[0] = new Cat(101, "Tishka", "Brit", 5, 3.5);
        cat[1] = new Cat(102, "Genny", "Sfinks", 1, 1.2);
        cat[2] = new Cat(103, "Murzik", "Pers", 9, 5.0);
        cat[3] = new Cat(104, "Motya", "Maine Coon", 2, 8.5);
    }

    @Test
    void testCatSort() {
        System.out.println("==============Test Cat Sorting===============");
        printArray(cat);//печатаем массив таким, как он есть, без сортировки
        Arrays.sort(cat);//выполнили сортировку
        System.out.println("=====Sotr by age=====");
        printArray(cat);
    }

    @Test
    void testSortComparator() {
        //второй способ сортировки, теперь не по возрасту а по айди
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());//равнили по именам
            }
        };
        printArray(cat);//печатаем массив без сортировки
        Arrays.sort(cat, catComparator);//выполнили сортировку с помощью компаратора
        System.out.println("=====Sort by name=====");
        printArray(cat);
    }

    @Test
    void testCatSortComparator2() {
        Comparator<Cat>catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        printArray(cat);//печатаем массив без сортировки
        Arrays.sort(cat, catComparator);//выполнили сортировку с помощью компаратора
        System.out.println("=====Sort by name=====");
        printArray(cat);
    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}