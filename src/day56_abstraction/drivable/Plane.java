package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements Greeting,SelfDriveable {
    @Override
    public void transportPeople() {
        System.out.println("flying from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost "+(mile*25.0)+" fly "+mile+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("flying on auto");
    }

    @Override
    public void hi() {
        System.out.println("welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("plane is landing, fasten your seatbelts");
    }
}
