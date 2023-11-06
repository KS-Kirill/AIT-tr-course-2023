package practice;

// Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
// Последнее сообщение: "Яблоки кончились!".
public class Apples {
    public static void main(String[] args) {

        int apples = 30;//стартовые значения:
        int counter = 0;// счётчик
        int applesInCycle = apples;// параментр

        while (applesInCycle > 0) {
            //тело цикла
            System.out.println("Take one apple from the basket" );
            applesInCycle--; //изменяем параметр цикла
            counter++;// количество выполненных операций
            System.out.println("The rest of apples " + applesInCycle);
        }
        System.out.println("The job is done, total apples  " + counter + " added in pie of " + apples + " in basket.");

    }
}
