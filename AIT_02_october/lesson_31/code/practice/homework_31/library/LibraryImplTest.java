package practice.homework_31.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.model.Employee;
import practice.company.model.Manager;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(3);
        books = new Book[3];
        books[0] = new Book(15L, "Jack London", "Martin Iden", 1907);
        books[1] = new Book(25L, "Jack London", "The Call of the Wild", 1903);
        books[2] = new Book(35L, "Jack London", "The sea - wolf", 1990);

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            library.addBook(book);
        }
    }

    @Test
    void addBook() {
        assertTrue(library.addBook(new Book(15L, "Jack London", "Martin Iden", 1907)));
        assertTrue(library.addBook(null));
    }

    @Test
    void removeBook() {
        //удаляем книгу по её ISBN
        assertEquals(books[0], library.removeBook(15L));
        //проверяем тееперь количество книг после удаления
        assertEquals(2, library.quantity());
        System.out.println(library.quantity());
        //удаляем ту, которая была удалена
        assertNull(library.removeBook(15L));
        //удаляем ту которой нет
        assertNull(library.removeBook(5L));
    }


    @Test
    void findBook() {
        // ищем книгу по isbn
        assertEquals(books[0], library.findBook(15L));
        // ищем несуществующую книгу
        assertNull(library.findBook(104L));
    }

    @Test
    void quantity() {
        assertEquals(3, library.quantity());

    }

    @Test
    void printBook() {
        library.printBook();
    }

    @Test
    void findBookByAuthor() {


    }
}