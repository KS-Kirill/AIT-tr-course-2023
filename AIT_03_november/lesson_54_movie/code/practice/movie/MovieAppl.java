package practice.movie;
import practice.movie.dao.MoviesCollectionImpl;
import practice.movie.model.Movie;
import java.time.LocalDate;
import java.util.List;

public class MovieAppl {
    public static void main(String[] args) {

//создаём объект типа LocalDate
        LocalDate now = LocalDate.now();
        //создаём объект типа MoviesCollection и заполняем его фильмами
        MoviesCollectionImpl moviesCollection = new MoviesCollectionImpl(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2,"B","B","B",now.minusYears(4)),
                new Movie(3,"C","C","C",now.minusYears(1)),
                new Movie(4,"D","D","D",now.minusYears(2)),
                new Movie(5,"E","E","E",now.minusYears(7))
        ));
        System.out.println("===========Film collection============");

        //выводим на экран все фильмы
        for (Movie m : moviesCollection) {
            System.out.println(m);
        }
        System.out.println("===========Total quantity============");
        System.out.println("Total quantity: " + moviesCollection.totalQuantity());

        System.out.println("===========Films producer for the last 5 years============");
        //выводим на экран фильмы, созданные за последние 5 лет
        for (Movie m : moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(5), now)) {
            System.out.println(m);
        }
    }
}
