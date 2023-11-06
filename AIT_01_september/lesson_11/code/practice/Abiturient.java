package practice;

//Имеются оценки абитуриента из его аттестата, всего 20 оценок.
// Найдите средний балл абитуриента.

public class Abiturient {
    public static void main(String[] args) {

        //объявили и заполнили массив
        int[] marks = {2, 3, 3, 1, 4, 3, 2, 1, 1, 3, 2};

        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            sumOfMarks = sumOfMarks + marks[i];
            //sumOfMarks += marks [i];
        }
        double averageMark = (double) sumOfMarks / marks.length;
        System.out.printf("Average mark: %.1f", averageMark);
    }
}
