package org.example;

import java.util.ArrayList;
import java.util.List;

interface TaskObserver{
    void update(TaskSubject taskSubject);
}

interface TaskSubject{
    void attach(TaskObserver observer);
    void detach(TaskObserver observer);
    void notifyObservers();
}

// Implement TASK SUBJECT
class TaskManager implements TaskSubject{
    private List<TaskObserver> observers = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(String task){
        tasks.remove(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void attach(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(TaskObserver observer: observers){
            observer.update(this);
        }
    }
}

// Concrete Observer
class User implements TaskObserver{
    private String userName;

    public User(String userName){
        this.userName = userName;
    }

    @Override
    public void update(TaskSubject taskSubject) {
        System.out.println("\n" + userName + ": TASK-UPDATED (" + ((TaskManager)taskSubject).getTasks() + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        User user1 = new User("John");
        User user2 = new User("Sarah");

        taskManager.attach(user1);
        taskManager.attach(user2);

        taskManager.addTask("Buy groceries");
        taskManager.removeTask("Buy groceries");
    }
}