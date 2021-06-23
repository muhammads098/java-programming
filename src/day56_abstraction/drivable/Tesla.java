package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDriveable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs "+(mile*0.10)+" to drive "+mile+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("tesla is driving auto ");
    }

    @Override
    public void hi() {
        System.out.println("Hello Hello peep peep ");
    }

    @Override
    public void bye() {
        System.out.println("Bye ");
    }
}
