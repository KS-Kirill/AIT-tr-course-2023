package practice;

// Создайте массив, который содержит возраст студентов группы.
//какой возраст максимальный?
//какой возраст минимальный?
//есть ли однокурсники с одинаковым возрастом?
// Если да, то сколько студентов, у которых одинаковый возраст?

public class AgeOfStudents {
    public static void main(String[] args) {

        int[] ageOfStudents = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 29, 45, 47, 34, 29, 22};

        //ищем максимальный элемент массива
        int max = ageOfStudents[0];//это первый кандидат на максимум
        int indexMax = 0;

        for (int i = 0; i < ageOfStudents.length; i++) {
            if (ageOfStudents[i] > max) {//когда текущий элемент массива будет больше чем макс
                max = ageOfStudents[i]; // взяли максимальный элемент
                indexMax = i;//взяли его индекс
            }
        }
        System.out.println("Max age: " + max);
        System.out.println("Index of max element: " + indexMax);

        //ищем минимальный элемент массива
        int min = ageOfStudents[0];//это первый кандидат на минимум
        int indexMin = 0;

        for (int i = 0; i < ageOfStudents.length; i++) {
            if (ageOfStudents[i] < min) {//когда текущий элемент массива будет меньше чем мин
                min = ageOfStudents[i]; // взяли минимальный элемент
                indexMin = i;//взяли его индекс
            }
        }
        System.out.println("Min age: " + min);
        System.out.println("Index of min element: " + indexMin);

        //ищем дубликаты
        //идём по всем элеемнтам массива начиная с 0-го
        int dublicate = ageOfStudents[0];// кандидат на дубликат
        int dCount = 0;//счётчик дубликатов
        int index = 0;
        for (int i = 0; i < ageOfStudents.length; i++) {
            for (int j = i + 1; j < ageOfStudents.length; j++) {
                if (ageOfStudents[i] == ageOfStudents[j]) {
                    dublicate = ageOfStudents[i];
                    dCount++;
                    index = i;
                    System.out.println("Dublicate : " + dublicate + " index " + index);
                    System.out.println("Quantity of dublikate : " + dCount);
                }
            }
        }

    }
}
