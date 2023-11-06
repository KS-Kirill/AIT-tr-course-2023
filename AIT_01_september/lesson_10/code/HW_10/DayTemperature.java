package HW_10;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class DayTemperature {
    public static void main(String[] args) {

        // создаём массив с данными температур за 7 дней недели
        int[] temperaturesPerWeek = {24, 21, 19, 22, 18, 24, 25};

        //выводим на экран вторник и четверг
        System.out.println("Day Temperature is: " + temperaturesPerWeek[1] + " ° Celcium");
        System.out.println("Day Temperature is: " + temperaturesPerWeek[3] + " ° Celcium");

        //вычисляем среднюю температуру
        int sumOfTemperatures = 0;
        for (int i = 0; i < temperaturesPerWeek.length; i++) {
            sumOfTemperatures += temperaturesPerWeek[i];
        }
        int averageTemperature = sumOfTemperatures / temperaturesPerWeek.length;
        System.out.println("The average temperature per week: " + averageTemperature + " ° Celcium");
    }
}
