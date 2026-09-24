import model.Task;
import model.Habit;

public class Main{
    public static void main(String[] args){
        Habit h1 = new Habit(
            "Solve DSA",
            1,
            "Pending",
            4,
            "Solve 2 sliding window problems"
        );

        h1.complete();
        h1.displayHabit();
}
}