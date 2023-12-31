package practice.todolist_appl.model;

import java.util.Objects;

public class Task implements Comparable<Task> {
    // fields
    private int id; // идентификатор
    private String task; // содержание задачи
    private int taskNumber;

    // constructor

    public Task(String task) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }

    // геттеры и сеттеры


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    // метод toString


    @Override
    public String toString() {
        //todo сначала номер задачи, потом её текст (отредактировать)
        return "Task{" +
                "task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) {
        return this.id - o.id; // естественная сортировка по id, от меньшего к большему
    }
}