package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Computer [] comp = new Computer[2];

        comp[0] = new Computer("i9", 16,512, "Asus");
        System.out.println(comp[0]);

        comp [1] = new Laptop("i5", 256, 256, "Acer", "14", 1000, 2.0);
        System.out.println(comp[0]);

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);

        }
        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd = sumHdd + comp[i].getHdd();

        }
        System.out.println("Total HDD = " + sumHdd);


    }
}
