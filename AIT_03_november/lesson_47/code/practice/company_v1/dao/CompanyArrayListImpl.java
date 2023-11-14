package practice.company_v1.dao;

import practice.company_v1.model.Employee;
import practice.company_v1.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {
    //поля, которые опиывают компанию
    //private Employee[] employees; //массив для хранения сотрудников
    //private int size; //текущее количество сотрудников

    //fields
    List<Employee> employees; //вместо массива делаем List
    int capacity; //вместимость компании

    //constructor
    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>(); //размер указывать не надо
        this.capacity = capacity;
    }

    //methods
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) {
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size(); //вернули длину списка
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee e : employees) {
            res += e.calcSalary();
        }

        return res;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/employees.size();
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager salesManager) {
                res += salesManager.getSalesValue();
            }
        }

        return res;
    }

    @Override
    public void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
//        public Employee[] findEmployeesHoursGreaterThan(int hours) {
//            int count = 0;
//            //считаем сколько будет элементов массива, удовлетворяющих условию
//            for (int i = 0; i < size; i++) {
//                if (employees[i].getHours() > hours) {
//                    count++;
//                }
//            }
//            Employee[] res = new Employee[count]; //создаём массив размером count
//            //заполняем res
//            for (int i = 0, j = 0; j < res.length; i++) {
//                if (employees[i].getHours() > hours) {
//                    res[j++] = employees[i];
//                }
//            }
//            return res;  //это возвращаемый массив
//
//        }
        int count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                res[count] = employees.get(count);
                count++;
            }
        }
        return res;
    }


    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        //считаем сколько будет элементов массива, удовлетворяющих условию
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary()<maxSalary) {
//                count++;
//            }
//
//        }
//        Employee[] res = new Employee[count]; //создаём массив размером count
//        //заполняем res
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary()<maxSalary) {
//                res[j++] = employees[i];
//            }
//        }
//        return res; //это возвращаемый массив
        int count = 0;
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        count = 0;
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = e;
                count = count + 1;
            }
        }
        return res;
    }
}

