package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 54;
        int guessNumber;

        do {
            System.out.println("Guess the guessNumber from 0 to 100");
            guessNumber = scan.nextInt();
            if (guessNumber > secretNumber) {
                System.out.println("number is too large");
            } else if (guessNumber < secretNumber) {
                System.out.println("Number is too low");
            }


        } while (guessNumber != secretNumber);
        System.out.println("You guessed it");
    }
}
