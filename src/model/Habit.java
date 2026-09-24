package model;

public class Habit{
    private String Habit;
    private int priority;
    private String status;
    private int streak;
    private String description;

     public Habit(String Habit, int priority, String status,int streak, String description) {
        this.Habit = Habit;
        this.priority = priority;
        this.status = status;
        this.streak = streak;
        this.description = description;
    }

    public void complete(){
        status="Completed";
        System.out.println("Habit completed!!!");
        System.out.println();
    }

    public void displayHabit(){
        System.out.println("Habit: "+Habit);
        System.out.println("Status: "+status);
        System.out.println("Priority: "+priority);
        System.out.println("Streak: "+streak);
        System.out.println("Description: "+description);
    }
}
