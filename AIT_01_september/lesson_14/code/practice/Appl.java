package practice;

public class Appl {
    public static void main(String[] args) {
        int[] array = {-12, 5, 36, 28, -16, 100, 82, 64, 57, 5};

        BubbleSort2.printArray(array);//делаем сортировку
        BubbleSort2.bubbleSort(array);//печать до сортировки
        BubbleSort2.printArray(array);//печать после сортировки
    }
}
