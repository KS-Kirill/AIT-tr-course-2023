package practice;
// В программе задаются два целых числа.
// Найдите минимальное из них с помощью тернарного оператора.
// Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TerOperator {
    public static void main(String[] args) {
        int a = 123;
        int b = 745;

        Scanner scanner = new Scanner(System.in); // включает считывание с клавиатуры
        System.out.println("Input first number: ");// приглашение пользователю для ввода числа
        int number1 = scanner.nextInt();// отвечает за получение числа с клавиатуры
        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();

        int isMin = (a < b) ? a : b;

        int isMin2 = (number1 < number2) ? number1 : number2;

        System.out.println("Minimum = " + isMin);
        System.out.println("Minimum2 = " + isMin2);
    }
}
