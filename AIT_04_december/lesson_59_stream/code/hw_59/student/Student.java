package hw_59.student;

import jdk.jfr.Period;

import java.time.LocalDate;
import java.util.Objects;

//создать класс Student с полями: id, firstName, lastName, birtDay, course, groupNum (номер группы), country, gender(пол).
//
public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String birtDay;
    private int course;
    private int groupNum;
    private String country;
    private String gender;

    public Student(long id, String firstName, String lastName, String birtDay, int course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay='" + birtDay + '\'' +
                ", course=" + course +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {//сравниваем по имени и возрасту
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && groupNum == student.groupNum && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {//вычисляем хэшкод по имени и возрасту
        return Objects.hash(id, firstName, lastName, course, groupNum);
    }

    public int getAge() {//этот метод вычисляет возраст студента, при это учитывая месяц и день рождения
        LocalDate birthDate = LocalDate.parse(birtDay);//преобразуем строку в дату
        LocalDate currentDate = LocalDate.now();//получаем текущую дату
        int age = currentDate.getYear() - birthDate.getYear();//вычисляем возраст
        if (currentDate.getMonthValue() < birthDate.getMonthValue()) {//если текущий месяц меньше месяца рождения, то возраст уменьшаем на 1
            age--;
        } else if (currentDate.getMonthValue() == birthDate.getMonthValue()) {//если текущий месяц равен месяцу рождения, то сравниваем дни
            if (currentDate.getDayOfMonth() < birthDate.getDayOfMonth()) {//если текущий день меньше дня рождения, то возраст уменьшаем на 1
                age--;
            }
        }
        return age;
    }

    public double getMarksAvg() {//этот метод вычисляет средний балл студента
        int[] marks = {5, 4, 3, 2, 5, 4, 3, 2, 5, 4};//
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }
}
