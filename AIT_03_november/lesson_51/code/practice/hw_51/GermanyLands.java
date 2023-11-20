package practice.hw_51;
//Задача 1. Написать программу, которая:
//прочитает с клавиатуры количество вводимых названий земель в Германии,
//прочитает с клавиатуры названия земель и соберёт их в множество,
//выведет полученные результаты на экран.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GermanyLands {
    public static void main(String[] args) {
        //делаем сканнер для ввода земель с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //приглашение к вводу
        System.out.println("Input number of lands: ");
        int numberOfLands = scanner.nextInt();
        //создаем множество
        Set<String> lands = new HashSet<>();
        //вводим названия земель
        for (int i = 0; i < numberOfLands; i++) {
            System.out.println("Input land name: ");
            String landName = scanner.next();
            lands.add(landName);
        }
        //выводим результаты на экран
        System.out.println("Lands: " + lands);
        for (String land : lands) {
            System.out.println(land);
        }
    }
}
