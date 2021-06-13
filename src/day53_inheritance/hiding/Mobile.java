package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type="Mobile Phone";

    public static void use(){
        System.out.println("Using mobile Phone");
    }
    public void text(){
        use();
        System.out.println("and sending a text message");
    }
    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
    }
}
