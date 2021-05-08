package day36_methods_with_returns;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("full name = " + fullName());
        isMarried();
        System.out.println("is married = "+isMarried());
        getAge();
        System.out.println("get age = "+getAge());
        getRandomYear();
        System.out.println("Random year = "+getRandomYear());

        String name=fullName();
        boolean married=isMarried();
        int age=getAge();
        int year=getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age=35;
        return age;
    }
    public static int getRandomYear(){
        Random random=new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }
}
