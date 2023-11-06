package practice.company_v1.dao;

import practice.company_v1.model.Employee;

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

    //__________________________________________________
    //список работников, у которых отработано больше часов, чем...
    Employee[] findEmployeesHoursGreaterThan(int hours);

    //список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);



}
