package homework_32.dao;

public interface Shop {
    long getId();

    String getModel();
    double getPrice();
    int getQuantity();
    void setPrice(double price);
    void setQuantity(int quantity);
    double calculateTotalPrice();

}
