package practice.hw_46;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
//Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10.
// Удалите из полученного списка дубликаты.

public class Interval1to10 {
    public static void main(String[] args) {
        //Создаём массив для хранения случайных чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        //Заполняем массив случайными числами в интервале от 1 до 10
        for (int i = 0; i < 20; i++) {
            int randomNum = random.nextInt(10) + 1;
            numbers.add(randomNum);
        }
        //Выводим на печать содержимое массива
        System.out.println("List of numbers: " + numbers);
        //Удаляем дубликаты из массива
        HashSet<Integer> deleteDublicate = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(deleteDublicate);
        //Выводим на печать содержимое массива без дубликатов
        System.out.println("List of numbers without dublicates: " + numbers);

    }
}
