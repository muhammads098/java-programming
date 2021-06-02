package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount dad=new BankAccount();
        dad.user="dad";
        dad.showBalance();
        dad.spend(89.9);
        dad.showBalance();

        BankAccount kid=new BankAccount();
        kid.user="kid";
        kid.showBalance();

    }
}
