package HomeWork_07;
//Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
//Эспрессо
//Американо
//Латте
//Капучино После выбора программа должна сообщить стоимость выбранного напитка.

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to drink?(Espresso, Americano, Latte, Cappuccino): ");
        String coffee = scanner.next();

        switch (coffee) {
            case "Espresso" -> System.out.println("Price: 2€");
            case "Americano" -> System.out.println("Price: 2,5€");
            case "Latte" -> System.out.println("Price: 3€");
            case "Cappuccino" -> System.out.println("Price: 3€");
            default -> System.out.println("Wrong input!");
        }
    }
}
