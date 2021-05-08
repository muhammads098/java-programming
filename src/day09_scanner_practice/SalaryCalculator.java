package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        double hourlyRate=58.5;
        double weeklyPay= hourlyRate* 40;
        System.out.println("Weekly Pay: "+weeklyPay);
        double monthlyPay=weeklyPay*52/12;
        System.out.println("Monthly PAY: "+monthlyPay);
        double annualPay= monthlyPay*12;
        System.out.println("Annual Pay: "+annualPay );




    }

}
