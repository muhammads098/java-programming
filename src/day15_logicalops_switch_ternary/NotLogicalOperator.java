package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true="+ (!true));
        System.out.println("!false="+(!false));

        int age=2;
        if (!(age>7)){
            System.out.println("Need to sit in child car seat. age = "+ age);
        }else{
            System.out.println("Can sit in regular seat. Age = "+ age);
        }
        boolean isSmokingAllowed=false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit.");
        }

        boolean isAfforable=true;
        if (!isAfforable){
            System.out.println("Item not affordable");
        }

        String carModel="Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested");
        }

        String secretPassword="abc123";
        String inputPassword="abc321";
        if (!inputPassword.equals("abc123")){
            System.out.println("Incorrect Password");
        }
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect Password");
        }
        if (inputPassword.equals("abc123")){
            System.out.println("Correct Password");
        }else{
            System.out.println("In correct Password");
        }



    }
}
