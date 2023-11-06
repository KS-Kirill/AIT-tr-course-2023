package HW_17.Task1.model.cube;
//Задача 1. Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    //вычисляем периметр куба

    public int perimetr () {
        return 12 * side;
    }
    public int square () {
        return 6 * side * side;
    }
    public int volume () {
        return side * side * side;
    }
    public void display () {
        System.out.println("Perimeter: " + perimetr() + "|"  + "Square: " + square() + "|"  + "Volume: " + volume());
    }
}
