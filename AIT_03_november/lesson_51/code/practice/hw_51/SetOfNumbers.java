package practice.hw_51;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Задача 2. Написать программу, которая:
//прочитает с клавиатуры количество вводимых чисел,
//прочитает с клавиатуры сами числа и соберёт их в множество,
//удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход программы, целые.
public class SetOfNumbers {
    public static void main(String[] args) {
        //делаем сканнер для ввода чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //приглашение к вводу
        System.out.println("Input number of numbers: ");
        int numberOfNumbers = scanner.nextInt();
        //создаем множество
        Set<Integer> numbers = new HashSet<>();
        //вводим числа
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Input number: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        //выводим результаты на экран
        System.out.println("Numbers: " + numbers);

        numbers.removeIf(number -> number > 10);

        System.out.println("Numbers: " + numbers);
    }
}