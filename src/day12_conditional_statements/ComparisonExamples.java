package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit=55;
        boolean isSpeeding=currentSpeed>=speedLimit;
        System.out.println(" Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance=250.25;
        double itemPrice= 100.90;
        System.out.println("can i afford?-" + (accountBalance >= itemPrice));
        
        boolean canAfford= accountBalance>=itemPrice;
        System.out.println("canAfford = " + canAfford);

        accountBalance=accountBalance-itemPrice;
        accountBalance-=itemPrice;

        boolean isBroke= accountBalance==0;
        System.out.println("isBroke = " + isBroke);




    }

}
