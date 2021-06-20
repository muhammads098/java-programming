package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories "+exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30min - calories "+exercise.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("swimming for 30 min - calories "+swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        freeWeight.endLift();
        System.out.println("Lifted weights for 30 min - calories "+freeWeight.getCaloriesCount(30));



    }
}
