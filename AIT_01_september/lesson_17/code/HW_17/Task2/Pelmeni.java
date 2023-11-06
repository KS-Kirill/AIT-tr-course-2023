package HW_17.Task2;

import java.util.Random;

// Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.
public class Pelmeni {
    public static void main(String[] args) {
        //заполняем массив пельменями разного веса
        int [] pelmeni = new int[31];
        int luckyPelmen = -1;
        Random random = new Random();

        //заполняем массив пельменями массы 25-35 граммов
        int weightOfPelmen = 25;
        for (int i = 0; i < pelmeni.length; i++) {
            pelmeni [i] = weightOfPelmen;
            weightOfPelmen++;
            if (weightOfPelmen > 35) {
                weightOfPelmen = 25;
            }
        }
        //ложим монету рандомно в пельмень

        luckyPelmen = random.nextInt(31);
        pelmeni[luckyPelmen] += 15;

        for (int i = 0; i < 31; i++) {
            if (pelmeni [i] > 40) {
                luckyPelmen = i;
                break;
            }
        }
        if (luckyPelmen != -1) {
            System.out.println("Lucky Pelmen is found!Index: " + luckyPelmen + ", Weight " + pelmeni [luckyPelmen] + " gramm!" );
        } else {
            System.out.println("Lucky Pelmen is not found :(");
        }
    }
}
