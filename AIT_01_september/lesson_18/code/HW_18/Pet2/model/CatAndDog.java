package HW_18.Pet2.model;
//Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.

public class CatAndDog {

    private String name;
    private int age;

    public CatAndDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void voice () {
        System.out.println("Your pet's voice is: ");
    }
}