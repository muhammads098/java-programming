package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("####### Miles To KM Converter  #######");
        System.out.println("Enter Miles: " );
        double miles = scan.nextDouble();
        double kilometers= miles * 1.609;
        System.out.println(miles +" in kilometers: "+kilometers);



    }
}
