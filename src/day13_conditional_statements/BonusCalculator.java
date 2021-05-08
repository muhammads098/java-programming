package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 2000) {
            System.out.println("good job you qualified for bonus");
            bonus = 50;

        } else {
            System.out.println("great job you qualified for full bonus");
            bonus = 100;
        }
        System.out.println("YOur total bonus: $"+bonus);
    }
}







