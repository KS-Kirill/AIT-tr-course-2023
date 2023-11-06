package HW_09;
// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость.
// Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.

import java.util.Scanner;

public class CinemaTicketPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?: ");
        int age = scanner.nextInt();

        System.out.println("Are you a student? (yes/no): ");
        String student = scanner.next();

        System.out.println("Would you like VIP - ticket? (yes/no): ");
        String VIP = scanner.next();

        double ticketPrice = calculateTicketPrice(age, student, VIP);
        System.out.println("Price of a ticket: " + ticketPrice);
    }
    public static double calculateTicketPrice(int age, String student, String VIP) {
        double basicPrice = 100;

        if (age >= 65){
            double discount = basicPrice * 0.25;
            basicPrice = basicPrice - discount;
        }
        if ("yes".equals(student)){
            double discount = basicPrice * 0.10;
            basicPrice = basicPrice - discount;
        }

        if ("yes".equals(VIP)) {
            double overPrice = basicPrice * 0.25;
            basicPrice = basicPrice + overPrice;
            }

        return basicPrice;
    }
}
