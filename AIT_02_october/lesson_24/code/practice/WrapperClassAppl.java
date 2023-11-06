package practice;

public class WrapperClassAppl {
    public static void main(String[] args) {
        //количество цифр в числе, версия 2
        Integer x = 987654321; // объект класса интеджер
        String st = x.toString();//преобразование строки
        int l = st.length();// узнали длину строки
        System.out.println("Number of digits in " + x + " = " + l);
        System.out.println(x.MAX_VALUE);//узнали максимальное значение числа
        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits in " + y + " = " + st1.length());

        //присвоение и вычисления
        int n = 20;
        Integer m = 10;
        System.out.println(n);
        System.out.println(m);
        m = m + n; //автораспаковка и автоупаковка для н
        System.out.println("m + n = " + m);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println("Circle length = " + circleLength);
        System.out.printf("Circle length = %.2f" , circleLength);
        System.out.println();

        //константы класса
        System.out.println( "-----------------Conctants of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Integer MAX " + Long.MAX_VALUE);
        System.out.println("Integer MIN " + Long.MIN_VALUE);
        System.out.println("Integer MAX " + Double.MAX_VALUE);
        System.out.println("Integer MIN " + Double.MIN_VALUE);

        //обработка деления на ноль
        System.out.println("-----------------------Not a number (NaN)-----");
        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong operation or wrong result. ");
        } else {
            System.out.println(a);
        }

        //перевод String to number
        System.out.println( "Parsing String to number");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String " + str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp = " + exp);

    }
}
