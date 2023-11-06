package practice;

// Пользователь вводит натуральное число n.
// Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //алгоритм:
        //любое целое число "N" будем пробовать делать на числа, меньше его, начиная с "2"
        //10 % 2 = значит не простое; 11 делим на 2,3,4.....до 10. Если не разделилось, то число простое.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int div = 2;
        while (div < number){
            if (number % div == 0){ //если разделилось число нацело
                isPrime = false;

            }
            div++; //увеличиваем параметр
        }
        System.out.println(number + " is prime: " + isPrime);
    }
}
