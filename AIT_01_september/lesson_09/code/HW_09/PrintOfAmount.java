package HW_09;

//Задача 1. Распечатайте все числа меньшие 200 и кратные 13.

public class PrintOfAmount {
    public static void main(String[] args) {

        int count = 1;
        while (count < 200){
            if (count % 13 == 0){
                System.out.print(count + " | ");
            }
            count++;
        }
    }
}
