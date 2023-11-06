package practice.binary_search;

public class ArrayAppl3 {
    public static void main(String[] args) {

        int [] array = {-50, -10, 20, -100, 70, -10, 60, 40, 30, 50};

        ArrayMethod3.printArray(array);//напечатать
        ArrayMethod3.bubbleSort(array);//отсортировать
        ArrayMethod3.printArray(array);//напечатать
        ArrayMethod3.split();

        //вызываем бинарный поиск
        int index = ArrayMethod3.binarySearch(array, 20);
        System.out.println(index);

        index = ArrayMethod3.binarySearch(array, 40);
        System.out.println(index);

        int count = ArrayMethod3.searchDublicate(array , 50);
        System.out.println("Duplicate : " + count);

    }
}
