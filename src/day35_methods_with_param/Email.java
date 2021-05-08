package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("muhammad","google");
        buildEmail("Murodil","yahoo");
        buildEmail("Sheesh","Tiktok");

    }
    public static void buildEmail(String name,String domain){
        String email=name+"@"+domain+".com";
        System.out.println(email);
    }
}
