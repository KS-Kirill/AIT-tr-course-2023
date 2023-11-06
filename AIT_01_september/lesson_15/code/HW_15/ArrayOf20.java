package HW_15;
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

import java.util.Arrays;

public class ArrayOf20 {
    public static void main(String[] args) {
        //Создаём массив из 20-ти случайных целых чисел из интервала от -100 до 100.
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }
        //сортировка массива
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, 0);
        if (index >= 0) {
            System.out.println("Zero in array is found with index : " + index);
        } else {
            System.out.println("No zero in array!");
        }
    }
}