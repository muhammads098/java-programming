package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superman
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((Father) worker).playWithKid();
        ((Father) worker).feedKid();

        //DOWNCASTING From Worker to SUPERMAN
        SuperMan superMan= (SuperMan) worker;


    }
}
