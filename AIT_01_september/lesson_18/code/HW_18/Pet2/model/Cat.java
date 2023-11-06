package HW_18.Pet2.model;

public class Cat extends CatAndDog{
    private String breed;
    private int height;
    private int weight;

    public Cat(String name, int age, String breed, int height, int weight) {
        super(name, age);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    public void voice () {
        System.out.println("Yor cat is saying \" Meow!\"");
    }

}
