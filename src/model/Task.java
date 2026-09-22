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
        System.out.println();
    }

    public void displayTask(){
        System.out.println("Task: "+task);
        System.out.println("Status: "+status);
        System.out.println("Priority: "+priority);
        System.out.println("Description: "+description);
    }
}