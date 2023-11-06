package practice.car.model;

public class Car {
    //поля класса: первоя зона, характеризующая объект
    private String brand;
    private String color;
    private String model;

    private int year;
    private double power;
    private String fuelType;

    //конструктор  класса Car

    public Car(String brand, String color, String model, int year, double power, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.power = power;
        this.fuelType = fuelType;
    }

    //геттеры и сеттеры


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayCar() {
        System.out.println("Brand: " + brand + "Model: " + model + "Engine Power: " + power);
    }

}
