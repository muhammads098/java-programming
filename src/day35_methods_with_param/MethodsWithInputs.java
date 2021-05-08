package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
       displayValue(654);
       displayValue(33);
       int count=55;
       displayValue(count);
       greetByName("Murodil");
       greetByName("Saim");
       String name="Nadir";
       greetByName(name);
    }
    public static void displayValue(int num){
        System.out.println("Value is "+num);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+", how are you today?");
    }
}
