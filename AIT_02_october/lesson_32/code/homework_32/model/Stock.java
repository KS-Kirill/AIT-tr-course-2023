package homework_32.model;

import java.util.Objects;

public abstract class Stock {
    //поля
    protected long id;
    protected String model;
    protected double price;
    protected int quantity;
    //конструктор
    public Stock(long id, String model, double price, int quantity) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock shop = (Stock) o;
        return id == shop.id && Objects.equals(model, shop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public abstract double calculateTotalPrice();
}
