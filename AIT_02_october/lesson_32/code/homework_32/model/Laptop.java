package homework_32.model;

public class Laptop extends Stock {

    private double hours;
    private int weight;

    public Laptop (long id, String model, double price, int quantity, double hours, int weight) {
        super(id, model, price, quantity);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }



    @Override
    public double calculateTotalPrice() {
        return 0;
    }
}
