package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** Welcome to TD Bank ****");
        double secretPincode=1234;
        double inputPincode=1234;
        if (secretPincode==inputPincode){
            System.out.println("Welcome to your account.");
            System.out.println("you can withdraw, check balance, deposit.");

        }else{
            System.out.println("Incorrect Pincode! "+inputPincode);
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TD BANK");
    }
}
