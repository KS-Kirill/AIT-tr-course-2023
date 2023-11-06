package homework_lesson_29.Appl;

import java.util.Objects;

public abstract class Shape {

    //Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
    //Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
    //Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
    //Добавьте в массив два круга, один треугольник и один квадрат.
    //Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

        //field
        protected double side;

        public Shape(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Shape shape = (Shape) o;
            return Double.compare(side, shape.side) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(side);
        }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }

    // Абстрактные методы для вычисления площади и периметра
        public abstract double calcArea();
        public abstract double calcPerimeter();
    }


