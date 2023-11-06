package homework_lesson_29;

//Задача 3. Рассчитайте общую площадь кругов из задачи 2.

import homework_lesson_29.Appl.Circle;

public class SquareOfCircles extends FigureAppl{
    public static void main(String[] args) {
        double radius = 7.654332;

        Circle[] circles = new Circle[2];
        circles[0] = new Circle(radius);
        circles[1] = new Circle(radius);

        double totalArea = 0;
        for (int i = 0; i < circles.length; i++) {
            totalArea += circles[i].calcArea();
        }
        System.out.println("Total square of circles: " + totalArea);

    }

}
