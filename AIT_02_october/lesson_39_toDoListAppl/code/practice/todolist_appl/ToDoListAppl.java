package practice.todolist_appl;

import java.util.Scanner;
import practice.todolist_appl.dao.ToDoListImpl;
import practice.todolist_appl.model.Menu;
import practice.todolist_appl.model.Task;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl(10);
        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    System.out.println("Your tasks: ");
                    toDoList.printTasks();
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(task);
                    toDoList.addTask(newTask);
                    break;
                }
                case 3: {
                    System.out.println("Input task ID: ");
                    int id = scanner.nextInt();
                    Task findedTask = toDoList.findTask(id - 1);
                    System.out.println("Task found: " + findedTask);
                    break;
                }
                case 4: {
                    System.out.println("Input task ID: ");
                    int id = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(id -1);
                    System.out.println(removedTask + " is removed.");
                    break;
                }
                case 5:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}