package HomeWork_07;

//Написать программу, которая принимает с клавиатуры номер месяца и год
//и выводит на экран название месяца и количество дней в нем.

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month (1-12): ");
        int numbOfMonth = scanner.nextInt();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        scanner.close();
        String month;
        int daysInMonth;

        switch (numbOfMonth){
            case 1:
                month = "January";
                daysInMonth = 31;
                break;
            case 2:
                month = "February";
                daysInMonth = 28;
                break;
            case 3:
                month = "March";
                daysInMonth = 31;
                break;
            case 4:
                month = "April";
                daysInMonth = 30;
                break;
            case 5:
                month = "May";
                daysInMonth = 31;
                break;
            case 6:
                month = "June";
                daysInMonth = 30;
                break;
            case 7:
                month = "July";
                daysInMonth = 30;
                break;
            case 8:
                month = "August";
                daysInMonth = 31;
                break;
            case 9:
                month = "September";
                daysInMonth = 30;
                break;
            case 10:
                month = "October";
                daysInMonth = 31;
                break;
            case 11:
                month = "November";
                daysInMonth = 30;
                break;
            case 12:
                month = "December";
                daysInMonth = 31;
                break;
            default:
                month = "Incorrect input";
                daysInMonth = 0;
                break;
        }
        System.out.println("Name of month: " + month);
        System.out.println("Amount of days: " + daysInMonth);
    }
}
