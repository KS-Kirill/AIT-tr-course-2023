package practice.todolist_appl.dao;

import practice.todolist_appl.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    Task findTask(int id);

    void printTasks();

    // quantity of tasks
    int quantity();

    //todo - нужен ли в интерфейсе метод для выхода из меню?

}