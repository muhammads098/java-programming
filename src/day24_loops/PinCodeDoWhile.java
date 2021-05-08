package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secretPinCode=1234;
        int pinCode;
        do {
            System.out.println("Enter Pin code");
            pinCode=scan.nextInt();
        }while (pinCode!=secretPinCode);
        System.out.println("welcome to your account");

    }
}
