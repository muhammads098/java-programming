package day13_conditional_statements;

public class IFWithBooloanVariable {
    public static void main(String[] args) {
        boolean isHungry=true;
        if(isHungry){
            System.out.println("I am hungry, i will get something to eat.");
            System.out.println("Then code JAVA!");
        }else{
            System.out.println("i am not hungry,");
            System.out.println("I will keep coding Java");
        }
        double price=230.44;
        boolean isAffordable=200>=price;
        if(isAffordable){
            System.out.println("yes its affordable");
        }else{
            System.out.println("No its not affordable");
        }

        boolean isRemoteJob=false;
        if(isRemoteJob==false){
            System.out.println("Sorry Iam not interested");

        }else{
            System.out.println("Sure iam interested, what is the interview process?");
        }

    }
}
