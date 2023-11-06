package practice.student;

import java.util.Objects;

public class Student {
    //fields

    private String firstName;
    private String secondName;
    private int id;
    private int [] marks;

    public Student(String firstName, String secondName, int id, int[] marks) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.marks = marks;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //метод который считает средний балл студента
    public double averageMark(int[]marks){
        //сложить все оценки
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i]; //или sum = sum + marks[i]
        }

        //разделить на их количество
        return  sum/(double)marks.length; //можно записать как: double sum/marks.length;

    }

}
