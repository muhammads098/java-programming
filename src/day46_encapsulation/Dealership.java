package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1=new Car();

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(24567);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println("car1 = " + car1);

        Car alfaRomeo=new Car();
        alfaRomeo.setMileage(16000);
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);

        System.out.println("alfaRomeo Model = " + alfaRomeo.getModel());
        System.out.println("alfaRomeo Year = " + alfaRomeo.getYear());
        System.out.println("alfaRomeo.getMileage() = " + alfaRomeo.getMileage());

        System.out.println(alfaRomeo);





    }
}
