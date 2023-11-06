package homework_lesson_29.Appl;

public class Triangle extends Shape {

    public Triangle(double side) {
        super(side);
    }
    public double calcArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public double calcPerimeter() {
        return 3 * side;
    }
}
