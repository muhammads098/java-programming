package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3=new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.cost(120);
        plane.land();
        plane.stop();
        plane.bye();


    }
}
