package day49_static;

public class StaticTest {
    static String word="Java";

    public static void main(String[] args) {
        //1. static method can be called using classname
        StaticMethods.displayMessage("Wooden Spoon");
        //1.instance method needs an object to be called
        StaticMethods stm=new StaticMethods();
        stm.instanceMethod();
        System.out.println("word = " + word);
    }
}
