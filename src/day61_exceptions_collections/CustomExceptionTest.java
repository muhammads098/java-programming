package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            int minutes=70;
            System.out.println("class is going on for "+minutes+" minutes");
            if (minutes>50){
                throw new BreakTimeException("it is break time! ");
            }
            System.out.println("lets continue the class");
        } catch (BreakTimeException e) {
            e.printStackTrace();
        }

        double balance = 400.0;
        double itemPrice = 300.0;

        if (itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined. Not enough funds ");
        }
        System.out.println("item successfully purchased ");

    }
}
