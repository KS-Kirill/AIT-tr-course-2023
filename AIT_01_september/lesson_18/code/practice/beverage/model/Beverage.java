package practice.beverage.model;

public class Beverage {

    //fields of class
    private String title;
    private String packing;
    private int quantity;

    //constructor

    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }


    //пустой конструктор
    public Beverage() {

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // methods to buy для будущего объекта, который будет этот метод вызывать
    public void toBuy (String title, String packing, int quantity) {
        this.packing = packing;
        this.title = title;
        this.packing = packing;
        System.out.println("Go to the market and buy: " + title + " " + packing +  " " + quantity + " . ");

    }

    //method to check limits on stock
    public void displayStock () {
        System.out.println("We have: " + title + " " + packing + " " + quantity + " . ");
    }



}
