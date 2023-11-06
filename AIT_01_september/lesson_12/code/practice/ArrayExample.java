package practice;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        //объявляем метод
        int m = minElementOfArray(array);
        System.out.println("Min elenent of array is: " + m);


    }//====end of main=====

    //=====methods=====
    public static int minElementOfArray(int[] array) {
        //пробегаем по всему массиму, каждый элемент сравниваем с min
        //если элемент меньше минимума, то делаем min = "этому элементу"
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) { //если элемент массива с индексом "i<min"
                min = array[i];
            }
        }
        return min;
    }
    //=====end of methods=====
}
