package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount acc=new CheckingAccount();
        acc.setAccountHolder("John Smith");
        acc.setBalance(250.5);
        acc.setAccountNumber(431154324213L);
        acc.setType("Checking");

        System.out.println("acc = " + acc);


    }
}
