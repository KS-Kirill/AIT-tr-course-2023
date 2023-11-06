package practice.homework_31.library;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(long isbn);
    int quantity();
    void printBook();
}
