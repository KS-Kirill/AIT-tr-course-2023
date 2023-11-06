package practice;

import java.util.Scanner;

//Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак
public class Garbage {
    public static void main(String[] args) {
        //ввод названия мусора строкой, может быть много значений
        //жёлтый бак должен принять упаковки, пластик, пакеты
        //чёрный бак принимает бытовой мусор
        //синий бак

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage.");
        System.out.println("packages, plastic, bag, rest, waste, paper, cartoon");
        String garbage = scanner.next(); // принимаем ответы пользователя

        if (garbage.equals("package") | garbage.equals("plastic") | garbage.equals("bag")) { //== не применяется для стринг
            System.out.println("Put it into /n yellow box");
        } else if (garbage.equals("rest") | garbage.equals("waste")){
            System.out.println("Put it into black box");
        } else {
            System.out.println("Put it into blue box");
        }


    }
}
