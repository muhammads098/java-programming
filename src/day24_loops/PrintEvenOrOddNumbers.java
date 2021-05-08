package day24_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers: ");
        for (int n=1;n<=100;n++){
            if (n%2==0){
                System.out.print(n + " ");
            }
        }
        System.out.println("\n Odd Numbers: ");
        for (int k=0;k<=100;k++){
            if (k%2!=0) {
                System.out.print(k + " ");
            }
        }
    }
}
