package practice;

public class BubbleSort2 {

    public static void bubbleSort (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {  //правый конец будет двигаться навстречу к левому, к началу
                if (arr[j] > arr[j + 1]){ //если левый сосед больше правого, то их меняем местами
                    int tmp = arr[j];
                    arr [j] = arr[j+1];
                    arr [j+1] = tmp;
                }
            }
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


