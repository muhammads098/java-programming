package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location ="New York";
        double salary=120_000;
        boolean remote= true;
        boolean benefits=true;
        if (location.equals("New York")&&salary>=120_000&&remote&&benefits){
            System.out.println("Great I will take the job!");

        }


    }
}
