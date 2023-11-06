package HW_17.Task1.model;

import HW_17.Task1.model.cube.Cube;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(15);
        Cube cube3 = new Cube(25);

       cube1.display();
        System.out.println(cube1.getSide());
        cube2.display();
        System.out.println(cube2.getSide());
        cube3.display();
        System.out.println(cube3.getSide());
    }
}
