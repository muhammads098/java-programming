package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide=new Lyft();
        LyftXL lyftXLRide=new LyftXL();
        Lux luxRide=new Lux();
        System.out.println("Lyft ride for 5 miles $"+luxRide.calculateRate(5));
        System.out.println("lyftXLride for 5 mile $"+lyftXLRide.calculateRate(5));
        System.out.println("luxRide for 5 mile $"+luxRide.calculateRate(5));
    }
}
