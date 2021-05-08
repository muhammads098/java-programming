package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company="Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.startsWith("Ca"));
        System.out.println(company.endsWith("one"));
        System.out.println(company.equals(""));


        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }

        String etsyTitle="Wooden spoon | Etsy";
        if (etsyTitle.contains("|")){
            System.out.println("Pass - title check");
        }else{
            System.out.println("Fail - title check");
        }
        String firstName="muhammad";
        if (firstName.contains("a")&&firstName.contains("e")){
            System.out.println("Both a & e are present ");
        }else{
            System.out.println("a & e are not present ");
        }

         firstName="Nadir";
        if (firstName.contains("a")||firstName.contains("i")){
            System.out.println("a or i is present");
        }else{
            System.out.println("a or e is not present");
        }
        String email="ms@gmail.com";
        if (email.contains("@")&&email.endsWith(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }

        String word="java";
        System.out.println(word.replace("a", "u"));


    }
}
