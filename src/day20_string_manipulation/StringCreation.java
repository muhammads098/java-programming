package day20_string_manipulation;
import java.lang.*;
public class StringCreation {
    public static void main(String[] args) {
        String word1="imac";
        String word2=new String(("macbook"));
        String word3="";
        String word4=new String();
        System.out.println(word4);
        System.out.println("java");
        System.out.println("Hello World");

        String car="lexus";
        System.out.println(car.isEmpty());

        String city="";
        System.out.println(city.isEmpty());
        System.out.println(city.length()==0);

    }
}
