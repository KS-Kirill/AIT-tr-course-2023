package practice.company.dao;

import practice.company.model.Employee;

//- добавить сотрудника
//- удалить сотрудника
//- найти сотрудника
//- кол-во сотрудников
//- ФОТ
//- средняя з/п
//- объем продаж
//- напечатать список сотрудников
public interface Company {
    //declare methods, только сигнатуры, без тела метода
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee (int id);
    int quantity();

    double totalSalary();
    double averageSalary();
    double totalSales();
    void printEmployees();



}
