package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word="Cybertek";
        System.out.println(word);
        System.out.println(word.toLowerCase(Locale.ROOT));
        System.out.println("JAVA".toLowerCase(Locale.ROOT));
        String company="Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase -" +company);
        System.out.println("java".toUpperCase());
        company=company.toUpperCase();
        System.out.println("company = " + company);



    }
}
