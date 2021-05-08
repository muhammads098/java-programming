package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word="java";
        String[] array=word.split("a");
        System.out.println(array.length);
        int countOfA=array.length;
        System.out.println("countOfA "+countOfA);
        if (word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA "+countOfA);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
     }
}
