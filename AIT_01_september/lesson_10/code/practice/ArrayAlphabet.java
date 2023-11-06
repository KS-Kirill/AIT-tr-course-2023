package practice;

//Создайте массив и заполните его символами латинского алфавита от A до Z.
// Раcпечатайте полученный массив.

public class ArrayAlphabet {
    public static void main(String[] args) {

        //заполнить массив цифрами от 1 до 20
       int [] arrayNum = new int[20];//объявили массив

        //цикл заполнения массива данными
        for (int i = 0; i < arrayNum.length; i++) { //запускаем цикл
            arrayNum[i] = i + 1; //заполняем элементы массива
        }
        //цикл для печати массива
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println();
        System.out.println("0-й по индексу элемент: " + arrayNum[0]);
        System.out.println("19-й по индексу элемент: " + arrayNum[19]);

        char[] alphabet = new char[26];
        //заполнение
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i);// 65 это код большой буквы А латинского алфавита

        }
        //печать массива
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
