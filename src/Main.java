import model.Task;

import java.util.ArrayList;

import model.Habit;

public class Main{
    public static void main(String[] args){
        ArrayList<Task> tasks = new ArrayList<>();
        ArrayList<Habit> habits = new ArrayList<>();
        Habit h1 = new Habit(
            "Solve DSA",
            1,
            "Pending",
            4,
            "Solve 2 sliding window problems"
        );

        habits.add(h1);
        h1.complete();
        h1.displayHabit();
}
}