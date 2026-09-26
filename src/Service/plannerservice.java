package Service;

import java.util.ArrayList;
import model.Habit;
import model.Task;

public class plannerservice{

    ArrayList<Task> tasks = new ArrayList<>();
    ArrayList<Habit> habits = new ArrayList<>();


    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task successfully added");
        System.out.println();
    }

    public void addHabit(Habit habit){
        habits.add(habit);
        System.out.println("Habit successfully added");
        System.out.println();
    }

    public void displayAllTaks(){
        for(Task t:tasks){
            t.displayTask();
        }
    }

    public void displayAllHabits(){
        for(Habit h:habits){
            h.displayHabit();
        }
    }

}