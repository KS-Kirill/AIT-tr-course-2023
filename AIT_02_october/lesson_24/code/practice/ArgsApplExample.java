package practice;

public class ArgsApplExample {
    public static void main(String[] args) {
        //String[] args это массив типа String и именем args
        // в этот массив можно передавать данные при старте программы из командной строки

        String str1 = args [0]; //приняли перый аргумент
        int num1 = Integer.parseInt(str1); //перевели в числе при помощи метода

        String str2 = args [1]; //приняли 2 аргумент
        int num2 = Integer.parseInt(str2); //перевели в числo при помощи метода

        System.out.println(str1 + " * 0" + str2 + " = " + num1 * num2);
    }
}
