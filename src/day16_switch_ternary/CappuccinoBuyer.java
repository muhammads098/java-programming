package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size="tall";
        double price=0.00;
        double calories=0;
        switch (size) {
            case "tall":
                System.out.println("Tall Cappucino Please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grande Cappucino Please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti Cappucino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We Dont Serve that Size " + size + "Cappucino");
                break;

        }
        System.out.println("Total Price $"+price);
        System.out.println();



    }
}
