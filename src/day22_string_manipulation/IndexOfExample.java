package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies="java, html, css,selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava=technologies.indexOf("java");
        System.out.println("java is at index "+indexOfJava);

        int idxOfCss=technologies.indexOf("css");
        System.out.println("css is at index "+idxOfCss);

        int indexOfCumcumber=technologies.indexOf("cucumber");
        System.out.println("cucumber is at index "+indexOfCumcumber);

        if (technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven")>-1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        String word="hello";
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("el"));
        System.out.println(word.indexOf("lo"));

        System.out.println(word.indexOf("j"));
        System.out.println(word.indexOf("world"));
        System.out.println(word.indexOf("tomato"));

        if (word.indexOf("el")>-1){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }



    }
}
