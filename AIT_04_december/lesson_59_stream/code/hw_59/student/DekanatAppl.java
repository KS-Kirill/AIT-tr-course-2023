package hw_59.student;
//В приложении DekanatAppl создать студентов из разных стран, которые учатся на разных курсах, в разных группах.
// Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
// Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
// Дополнительное задание (*): добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.

import practice.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student(1, "Иван", "Иванов", "1990-12-31", 1, 1, "Украина", "м");
        students[1] = new Student(2, "Петр", "Петров", "1991-11-12",1, 2, "Россия", "м");
        students[2] = new Student(3, "Сидор", "Сидоров", "1992-03-30", 1, 3, "Беларусь", "м");
        students[3] = new Student(4, "Анна", "Иванова", "1993-03-17", 1,4, "Молдова", "ж");
        students[4] = new Student(5, "Мария", "Марусий", "1994-04-04", 1, 5, "Казахстан", "ж");
        students[5] = new Student(6, "Елена", "Еленина", "1995-05-23", 2, 1, "Украина", "ж");
        students[6] = new Student(7, "Артём", "Артемьев", "1990-02-11", 2, 2, "Россия", "м");
        students[7] = new Student(8, "Егор", "Егоркин", "1992-05-14", 2, 3, "Молдова", "м");
        students[8] = new Student(9, "Дмитрий", "Дмитриев", "1992-06-26", 2, 4, "Казахстан", "м");
        students[9] = new Student(10, "Мария", "Маринина", "1994-04-15", 2, 5, "Беларусь", "ж");

        //положили пользователя в список типа ArrayList
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            studentList.add(students[i]);
        }
        // Перебор всех элементов userList с помощью forEach() и вывод их в консоль
        printStudents(studentList);

        // Сделать списки студентов по курсам
        printStudentsByCourse(studentList);
        
        // Сделать списки студентов по группам
        printStudentsByGroup(studentList);
        
        // Сделать списки студентов отсортированные по фамилиям
        printStudentsSortedByLastName(studentList);
        
        // Сделать списки студентов отсортированные по возрасту
        printStudentsSortedByAge(studentList);
        
        // Сколько студентов мужчин?
        calcStudentsByGender(studentList, "м");
        
        // Сколько студентов женщин?
        calcStudentsByGender(studentList, "ж");
        
        // Какой у них средний возраст по курсу?
        calcStudentsAvgAgeByCourse(studentList, 1);
        
        // Какой у них средний возраст по всем студентам?
        calcStudentsAvgAge(studentList);
        
        // Дополнительное задание (*): добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.
        calcStudentsAvgMarks(studentList);
        
        

    }

    private static void calcStudentsAvgMarks(List<Student> studentList) {
        System.out.println("----------------------------------------");
        double averageMarks = studentList.stream()//создаём поток из списка
                .mapToDouble(Student::getMarksAvg)//промежуточный метод mapToDouble, который преобразует поток для каждого элемента с целью получить средний балл
                .average()//промежуточный метод average, который вычисляет среднее значение
                .getAsDouble();//промежуточный метод getAsDouble, который возвращает значение типа double
        System.out.println("Средний балл студентов: " + averageMarks);
    }

    private static void printStudents(List<Student> studentList) {
        System.out.println("----------------------------------------");
        studentList.stream()
                .forEach(n -> System.out.println(n));
    }

    private static void calcStudentsAvgAge(List<Student> studentList) {// Какой у них средний возраст по всем студентам?
        System.out.println("----------------------------------------");
        double averageAge = studentList.stream()//создаём поток из списка
                .mapToInt(Student::getAge)//промежуточный метод mapToInt, который преобразует поток для каждого элемента с целью получить возраст
                .average()//промежуточный метод average, который вычисляет среднее значение
                .getAsDouble();//промежуточный метод getAsDouble, который возвращает значение типа double
        System.out.println("Средний возраст студентов: " + averageAge);
    }

    private static void calcStudentsAvgAgeByCourse(List<Student> studentList, int i) {
        System.out.println("----------------------------------------");
        double averageAge = studentList.stream()//создаём поток из списка
                .filter(n -> n.getCourse() == i)//промежуточный метод filter, который отбирает студентов по курсу
                .mapToInt(Student::getAge)//промежуточный метод mapToInt, который преобразует поток для каждого элемента с целью получить возраст
                .average()//промежуточный метод average, который вычисляет среднее значение
                .getAsDouble();//промежуточный метод getAsDouble, который возвращает значение типа double
        System.out.println("Средний возраст студентов " + i + " курса: " + averageAge);

    }

    private static void calcStudentsByGender(List<Student> studentList, String м) {
        System.out.println("----------------------------------------");
        long count = studentList.stream()//создаём поток из списка
                .filter(n -> n.getGender().equals(м))//промежуточный метод filter, который отбирает студентов по полу
                .count();//промежуточный метод count, который возвращает количество элементов потока
        System.out.println("Количество студентов " + м + ": " + count);
    }

    private static void printStudentsSortedByAge(List<Student> studentList) {
        System.out.println("----------------------------------------");
        studentList.stream()//создаём поток из списка
                .sorted((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()))//промежуточный метод sorted, который сортирует элементы потока
                .forEach(n -> System.out.println(n));//терминальный метод, который выводит элементы потока на экран
    }

    private static void printStudentsByGroup(List<Student> studentList) {
        System.out.println("----------------------------------------");
        studentList.stream()//создаём поток из списка
                .collect(Collectors.groupingBy(Student::getGroupNum))//промежуточный метод groupingBy, который группирует элементы потока по группам
                .forEach((groupNum, students) -> System.out.println(groupNum + " - " + students.size()));//терминальный метод, который выводит элементы потока на экран
    }

    private static void printStudentsSortedByLastName(List<Student> studentList) {
        System.out.println("----------------------------------------");
        studentList.stream()//создаём поток из списка
                .sorted((n1, n2) -> n1.getLastName().compareTo(n2.getLastName()))//промежуточный метод sorted, который сортирует элементы потока
                .forEach(n -> System.out.println(n));//терминальный метод, который выводит элементы потока на экран
    }

    private static void printStudentsByCourse(List<Student> studentList) {
        System.out.println("----------------------------------------");
        studentList.stream()//создаём поток из списка
                .collect(Collectors.groupingBy(Student::getCourse))//промежуточный метод groupingBy, который группирует элементы потока по курсам
                .forEach((course, students) -> System.out.println(course + " - " + students.size()));//терминальный метод, который выводит элементы потока на экран
    }
}
