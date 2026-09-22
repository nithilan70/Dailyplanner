import model.Task;

public class Main{
    public static void main(String[] args){
        Task t1 = new Task(
            "Solve DSA",
            1,
            "Pending",
            "Solve 2 sliding window problems"
        );

        t1.complete();
        t1.displayTask();
}
}