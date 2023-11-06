package practice.company.dao;

import practice.company.model.Employee;


public class CompanyImpl implements Company{
    //fields, которые описывают компанию
    private Employee [] employees; //массив для хранения сотрудников
    private int size; //текущее количество сотрудников

    //конструктор
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];//максимальная вместимость
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }


    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double averageSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }


}
