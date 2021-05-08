package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start = scan.nextInt();

        System.out.println("Enter the end number");
        int end = scan.nextInt();

        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
    }
}

