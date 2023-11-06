package HW_09;

//Определение времени суток.
// Напишите программу, которая принимает текущий час (от 0 до 23) и
// выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class WhatTimeIsNow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what time is now (0-23): ");
        int nowIsAbout = scanner.nextInt();

        if (nowIsAbout >= 0 && nowIsAbout < 6){
            System.out.println("Das is nacht!");
        } else if (nowIsAbout >= 6 && nowIsAbout < 12){
            System.out.println("Das ist vormittag");
        } else if (nowIsAbout >= 12 && nowIsAbout < 18){
            System.out.println("Das ist Nachmittag!");
        } else if (nowIsAbout >= 18 && nowIsAbout < 24){
            System.out.println("Das ist Abend!");
        }
    }
}
