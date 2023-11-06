package homework_32.tests;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import homework_32.dao.ShopImpl;
import homework_32.model.Computer;
import homework_32.model.Laptop;
import homework_32.model.Stock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopImplTest {

    ShopImpl shop;
    Stock[] number;

    @BeforeEach
    void setUp() {
        shop = new ShopImpl(5);
        number = new Stock[4];
        number[0] = new Laptop(101, "Dell", 350, 5, 7.0, 800);
        number[1] = new Laptop(102, "Acer", 550, 3, 9.5, 1200);
        number[2] = new Computer(120, "Sumsung", 1050, 7, "i5", 16, 512);
        number[3] = new Computer(130, "Sony", 890, 2, "i9", 32, 512);

        for (int i = 0; i < number.length; i++) {
            shop.addStock(number[i]);
        }

    }

    @Test
    void addStockTest() {
        //не можем добавить несуществующий товар null

    assertTrue(shop.addStock(null));
    assertEquals(0, shop.getQuantity());

    assertTrue(shop.addStock(number[0])); // Ожидаем успешное добавление
    assertEquals(1, shop.getQuantity()); // Ожидаем, что количество товаров увеличилось на 1

    assertTrue(shop.addStock(number[1])); // Ожидаем успешное добавление
    assertEquals(2, shop.getQuantity()); // Ожидаем, что количество товаров увеличилось на 1

    assertTrue(shop.addStock(number[2])); // Ожидаем успешное добавление
    assertEquals(3, shop.getQuantity()); // Ожидаем, что количество товаров увеличилось на 1

    assertTrue(shop.addStock(number[3])); // Ожидаем успешное добавление
    assertEquals(4, shop.getQuantity()); // Ожидаем, что количество товаров увеличилось на 1

        // Попытка добавить еще один товар, когда склад полон

    }


    @Test
    void getId() {
    }

    @Test
    void getModel() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void getQuantity() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void setQuantity() {
    }

    @Test
    void calculateTotalPrice() {
    }
}