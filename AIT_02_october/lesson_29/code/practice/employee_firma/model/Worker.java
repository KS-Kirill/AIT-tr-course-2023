package practice.employee_firma.model;

public class Worker extends Employee{
    private double grade;

    public Worker(int id, String firstNAme, String lastName, int age, double hours, double grade) {
        super(id, firstNAme, lastName, age, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = grade * hours;
        return salary;
    }
}
