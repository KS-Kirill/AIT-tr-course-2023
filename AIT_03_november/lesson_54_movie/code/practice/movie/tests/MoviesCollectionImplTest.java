package practice.movie.tests;

import practice.movie.dao.MoviesCollection;
import practice.movie.dao.MoviesCollectionImpl;
import practice.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesCollectionImplTest {

    MoviesCollection moviesCollection;
    public static final LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImpl(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2,"B","B","B",now.minusYears(4)),
                new Movie(3,"C","C","C",now.minusYears(1)),
                new Movie(4,"D","D","D",now.minusYears(2)),
                new Movie(5,"E","E","E",now.minusYears(7))
        ));
    }

    @Test
    void addMovie() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(2, "B", "B", "B", now.minusYears(4)))
        );
    }

    @Test
    void removeMovie() {
        //удаляем существующий фильм
        assertNotNull(moviesCollection.removeMovie(1));
        //убеждаемся в количестве фильмов
        assertEquals(4, moviesCollection.totalQuantity());
        //удаляем несуществующий фильм
        assertNull(moviesCollection.removeMovie(6));
        //убеждаемся в количестве фильмов
        assertEquals(4, moviesCollection.totalQuantity());
    }

    @Test
    void findById() {
        //ищем существующий фильм
        assertNotNull(moviesCollection.findById(1));
        //ищем несуществующий фильм
        assertNull(moviesCollection.findById(6));
    }

    @Test
    void findByGenre() {
        Movie movie = moviesCollection.findById(1);
        assertNotNull(movie);
        assertEquals("A", movie.getGenre());

    }

    @Test
    void findByDirector() {
        Movie movie = moviesCollection.findById(1);
        assertNotNull(movie);
        assertEquals("A", movie.getDirector());
    }

    @Test
    void findMoviesCreatedBetweenDates() {
        //ищем фильмы, созданные между 2 и 4 годами назад
        Iterable<Movie> movies = moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(4), now.minusYears(2));
        //проверяем, что фильмы найдены
        assertNotNull(movies);
        //проверяем количество найденных фильмов
        int count = 0;
        for (Movie m : movies) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    void totalQuantity() {
        assertEquals(5, moviesCollection.totalQuantity());
    }

    @Test
    void iterator() {
        //проверяем, что коллекция содержит 5 фильмов
        int count = 0;
        for (Movie m : moviesCollection) {
            count++;
        }
        assertEquals(5, count);

    }
}