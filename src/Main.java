import model.Task;
import Service.plannerservice;

import java.util.ArrayList;
import model.Habit;

public class Main{
    public static void main(String[] args){
        plannerservice service = new plannerservice();
        Habit h1 = new Habit(
            "Solve DSA",
            1,
            "Pending",
            4,
            "Solve 2 sliding window problems"
        );

        service.addHabit(h1);
        service.displayAllHabits();
}
}