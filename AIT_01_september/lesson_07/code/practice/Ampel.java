package practice;

//Напишите программу для машины на светофоре.
// Что нужно делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {

        //как будем кодировать цвет сфетофора
        //или цифрами, или строкой *переменная типа стринг*
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the colour?(Red, Yellow, Green): ");
        String color = scanner.next(); //задаём переменную строкового типа

        switch (color){
            case "Red" -> System.out.println("Stop, wait!");
            case "Yellow" -> System.out.println("Be ready to go.");
            case "Green" -> System.out.println("You can go.");
            default -> System.out.println("Wrong input!");
        }

    }
}
