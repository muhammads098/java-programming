package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass- Case is correct");
        } else {
            System.out.println("Fail- case is incorrect");
        }

    }

}