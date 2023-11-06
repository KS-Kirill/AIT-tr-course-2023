package homework_lesson_29;
//Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
//Найдите среднюю величину по всем четным элементам массива.
//Разработайте соответсвующий тест (набор тестов).
public class AverageOfEvenInArray {
    public static void main(String[] args) {
        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        double average = findAverageOfEvenElements(array);
        System.out.println("Средняя величина по всем четным элементам массива: " + average);
    }
    public static double findAverageOfEvenElements(int[] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) sum / count;
    }


}

