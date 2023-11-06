package homework_08;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Input amount of repeats: ");
        int repetitions = scanner.nextInt();

        int count = 0;
        while (count < repetitions) {
            System.out.println(inputString);
            count++;
        }

        scanner.close();
    }
}
