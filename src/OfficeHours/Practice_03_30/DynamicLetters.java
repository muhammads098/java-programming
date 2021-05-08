package OfficeHours.Practice_03_30;

import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("do you want uppercase or lowercase");
        String upperOrLower=scan.next();
        int staring;
        int ending;

        if (upperOrLower.equals("uppercase")){
            staring='A';
            ending='Z';

        }else {
            staring='a';
            ending='z';

        }
        for (int i = staring; i <= ending; i++) {
            System.out.print((char)i + " ");

        }
    }
}
