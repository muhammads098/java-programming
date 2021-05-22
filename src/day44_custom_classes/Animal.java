package day44_custom_classes;

public class Animal {
    String type = "lion";

    public  void eat() {
        System.out.println("eating");
    }
    public void eat(String food){
        System.out.println("eating "+food);
    }
    public void speak(String speak){
        System.out.println("speaking "+speak);
    }

    public void speak() {
    }


}
