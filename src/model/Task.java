package model;

public class Task{
    private String task;
    private int priority;
    private String status;
    private String description;

    public Task(String task, int priority, String status, String description) {
        this.task = task;
        this.priority = priority;
        this.status = status;
        this.description = description;
    }

    public void complete(){
        status="Completed";
        System.out.println("Task completed!!!");
    }
}