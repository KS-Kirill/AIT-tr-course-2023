package homework_32.dao;

import homework_32.model.Stock;

public class ShopImpl implements Shop {
    private Stock[] stock; //массив, склад для хранения техники
    private int quantity; //количество единиц на склада
    private int capacity; //вместимость склада

    public ShopImpl(int capacity) {
        stock = new Stock[capacity];//максимальная вместимость склада
        this.capacity = capacity;
        this.quantity = 0;
    }

    public boolean addStock(Stock newStock) {

    if (quantity < capacity) {
    stock[quantity] = newStock;
    quantity++;
    return true;
    }
    return false;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setQuantity(int quantity) {

    }

    @Override
    public double calculateTotalPrice() {
        return 0;
    }
}
