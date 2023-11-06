package homework_lesson_29;

import homework_lesson_29.Appl.Circle;
import homework_lesson_29.Appl.Shape;
import homework_lesson_29.Appl.Square;
import homework_lesson_29.Appl.Triangle;

import java.util.Arrays;

public class FigureAppl {
    public static void main(String[] args) {
        //Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
        //Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
        //Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
        //Добавьте в массив два круга, один треугольник и один квадрат.
        //Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

        double side = 5;

        Shape[] figures = new Shape[4];
        figures[0] = new Circle(side);
        figures[1] = new Circle(side);
        figures[2] = new Triangle(side);
        figures[3] = new Square(side);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            totalArea += figures[i].calcArea();
            totalPerimeter += figures[i].calcPerimeter();
        }
        System.out.println("Общая площадь фигур: " + totalArea);
        System.out.println("Общий периметр фигур: " + totalPerimeter);
    }
}
