package day49_static;

public class StaticMethods {

    int num=10;
    static int count=5;

    public static void displayMessage(String message){
        System.out.println("message: "+message);
        System.out.println("count = "+count);
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method ");
       displayMessage("wooden spoon");
    }
    public void instanceMethod(){
        System.out.println("Instance method ");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
    }
}
