package homework_lesson_29.Appl;

public class Circle extends Shape {

    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return Math.PI * side * side;
    }
    public double calcPerimeter (){
        return 2 * Math.PI * side;
    }
}