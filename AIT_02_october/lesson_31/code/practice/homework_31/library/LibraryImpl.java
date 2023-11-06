package practice.homework_31.library;

public class LibraryImpl implements Library{
    Book [] books;
    int size;

   public LibraryImpl (int capacity) {
       books = new Book[capacity];
   }


    @Override
    public boolean addBook(Book book) {
       if (size == books.length || book == null || findBook(book.getIsbn())!=null){
           return true;
       }
       books [size] = book;
       size++;
       return false;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
          if(books[i].getIsbn() == isbn) {
               Book removedBook = books[i];
               books[i] = books[size-1];
                books [size - 1] = null;
                size--;
                return removedBook;
            }
        }


        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {// если нашёлся элемент массива у которого совпал id
                return books[i];//вернули найденного работника *элемент массива* типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }

    }
}

