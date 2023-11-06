package practice.employee_firma.model;

import java.util.Objects;

public abstract class Employee {
    //fields of class
    protected final int id;
    protected String firstNAme;
    protected String lastName;
    protected int age;
    protected double hours;

    //constructor

    public Employee(int id, String firstNAme, String lastName, int age, double hours) {
        this.id = id;
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Emloyee ");
        sb.append("id =").append(id);
        sb.append(", firstName='").append(firstNAme).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }

    public abstract double calcSalary(); //we defined abstract method; has no body!!
}
