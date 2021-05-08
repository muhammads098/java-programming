package day14_multi_branch_if_statements;
import java.util.Scanner;
public class calculatorV2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        double num1=scan.nextDouble();
        double num2= scan.nextDouble();
        System.out.println("Enter Operator:=,+,*,/9");
        char operator=scan.next().charAt(0);

        if (operator=='+'){
            System.out.println(num1+num2);
        }else if (operator=='-'){
            System.out.println(num1-num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/') {
            System.out.println(num1 / num2);

        }else {
            System.out.println("Do Nothing");


        }
    }
}