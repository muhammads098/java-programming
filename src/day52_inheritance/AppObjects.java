package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

    MobileApp mobileApp = new MobileApp();
    mobileApp.name="youtube";
    mobileApp.useTheApp(10);

    Instagram instagram = new Instagram();
    instagram.name="Instagram";
    instagram.useTheApp(23);

    Discord b22Discord = new Discord();
    b22Discord.useTheApp(22);
    b22Discord.name="Discord";


    }
}
