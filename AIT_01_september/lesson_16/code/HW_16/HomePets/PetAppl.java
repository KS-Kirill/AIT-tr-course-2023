package HW_16.HomePets;

import HW_16.HomePets.Pet.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1, "Dog",5, "Charlie");
        Pet pet2 = new Pet(2, "Cat", 2,  "Markiza");

        pet1.displayCar();
        pet2.displayCar();

        pet1.eat();
        pet1.noise();
        pet1.play();
        pet1.sleep();
        pet1.walk();

        pet2.eat();
        pet2.noise();
        pet2.play();
        pet2.sleep();
        pet2.walk();

    }

}
