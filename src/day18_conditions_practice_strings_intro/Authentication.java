package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN=1234;
        int expPinCode=4321;

        int last4SSN=1234;
        int pinCode=4320;

        if (last4SSN == expLast4SSN && pinCode==expLast4SSN) {
            System.out.println("Authenication Successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN!=expLast4SSN){
                System.out.println("Last 4 SSN number is incorrect");
            }else if (pinCode!=expPinCode){
                System.out.println("Pin code is incorrect");
            }

        }

    }
}
