package HW_16.HomePets.Pet;

public class Pet {

    private int id;
    private String breed;
    private int age;
    private String nameOfDog;

    public Pet(int id, String breed, int age, String nameOfDog) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.nameOfDog = nameOfDog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public void setNameOfDog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }


    public void displayCar() {
        System.out.println("ID: " + id + " | "  +  "Breed of your pet: " + breed + " | " + "Age of your pet: " + age + " | " + "Name of your dog: " + nameOfDog);

    }
    public void sleep () {
        System.out.println("Your Pet is sleeping too much.");
    }
    public void eat () {
        System.out.println("Your Pet is eating too much.");
    }
    public void noise () {
        System.out.println("Your Pet is making noise too much.");
    }
    public void play () {
        System.out.println("Your Pet is playing too much.");
    }
    public void walk () {
        System.out.println("You are walking with your Pet too much.");
    }
}
