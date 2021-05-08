package day19_class_vs_object_strings;

import java.util.Locale;

public class StringStartsEndsWIth {
    public static void main(String[] args) {
        String word="intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("INT"));
        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name="Irina";
        if (name.endsWith("a")){
            System.out.println("maybe its a female name ");

            String firstName="Mr. Nadir";
            if (firstName.startsWith("Mr.")){
                System.out.println("man");
            }else if (firstName.startsWith("Dr.")){
                System.out.println("doctor");
            }else if (firstName.startsWith("Mrs.")){
                System.out.println("married woman");
            }else if (firstName.startsWith("Ms.")){
                System.out.println("single woman");
            }else if (firstName.startsWith("Sr.")){
                System.out.println("senior");
            }
            String url="google.com";
            if (url.endsWith(".com")){
                System.out.println("Commerical website");
            }else if (url.endsWith(".gov")){
                System.out.println("Government website");
            }else if (url.endsWith(".edu")){
                System.out.println("Education website");
            }else if (url.endsWith(".org")){
                System.out.println("Organization website");
            }

        }

    }
}
