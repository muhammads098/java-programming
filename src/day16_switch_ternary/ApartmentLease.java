package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms=0;
        double startingPrice=0;
       switch (numberOfBedrooms){
           case 0:
               System.out.println("Studio Apartment Selected");
               startingPrice=1454.0;
               break;
           case 1:
               System.out.println("One bedroom selected");
               startingPrice=1725;
               break;
           case 2:
               System.out.println("Two bedroom selected");
               startingPrice=2899;
               break;
           default:
               System.out.println(numberOfBedrooms  + "Bedroom Currently Unavailable");
               break;
       }

        System.out.println("Starting Price $ "+startingPrice);
    }
}
