package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Lifting;

public class FreeWeight extends Lifting {

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*6;
    }

    @Override
    public void endLift() {
        System.out.println("carefully re-rack dumbbells ");

    }
}
