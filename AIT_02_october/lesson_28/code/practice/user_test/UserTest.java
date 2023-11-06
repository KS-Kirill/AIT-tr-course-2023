package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //смотрим инструкцию и всё по ней *урок 27*
    User user;
    final String email = "peter@gmail.com";// переменная статическая, только для этого класса, не изменяемая
    final String password = "12345Az!";// переменная статическая, только для этого класса, не изменяемая

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com");//устанавливаем новый емейл и тестируем
        assertEquals("peter@yahoo.com", user.getEmail());

    }

    @Test
    void setWithoutAt() {
        user.setEmail("peter.yahoo.com");
        assertEquals(email, user.getEmail());//если совпадут, значит валидацию не прошёл
    }
}