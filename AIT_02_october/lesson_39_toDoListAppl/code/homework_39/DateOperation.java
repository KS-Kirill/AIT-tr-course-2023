package homework_39;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    public static int getAge(String birthDate) {
        //TODO реализовать метод getAge, принимающий дату рождения в виде String, и возвращающий возраст в годах.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDateLocal = LocalDate.parse(birthDate, formatter);
        LocalDate currentDate = LocalDate.now();
        int years = (int) ChronoUnit.YEARS.between(birthDateLocal, currentDate);
        return (int) years;
    }

    public static String[] sortStringDates(String[] dates) {
        //TODO  реализовать метод sortStringDates, принимающий массив дат в виде массива данных типа String, и возвращающий отсортированный массив дат.
        Arrays.sort(dates);
        return dates;
    }
}
