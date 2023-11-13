package practice.hw_46;

import java.util.ArrayList;

// Заполните структуру типа ArrayList символами латинского алфавита от A до Z.
public class AlphabetList {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения символов
        ArrayList<Character> alphabet = new ArrayList<>();
        // Заполняем ArrayList символами от A до Z
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabet.add(i);
        }
        // Выводим на печать содержимое ArrayList
        System.out.println(alphabet);

        // Выводим на печать содержимое ArrayList в обратном порядке
        for (int i = alphabet.size() - 1; i >= 0; i--) {
            System.out.print(alphabet.get(i) + " ");
        }
        //Обращаемся к отдельным элементам массива
        System.out.println();
        System.out.println("First character of array: " + alphabet.get(0));
        System.out.println("Last character of array: " + alphabet.get(alphabet.size() - 1));

        //Выводим на печать только согласные буквы массива
        System.out.println("Consonants of array: ");
        for (int i = 0; i < alphabet.size(); i++) {
            if (alphabet.get(i) != 'A' &&
                    alphabet.get(i) != 'E' &&
                    alphabet.get(i) != 'I' &&
                    alphabet.get(i) != 'O' &&
                    alphabet.get(i) != 'U' &&
                    alphabet.get(i) != 'Y') {
                System.out.print(alphabet.get(i) + " ");
            }
        }

    }



}
