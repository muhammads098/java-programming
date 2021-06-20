package day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();


}
interface MyInterface2{

}

class MyClass implements  MyInterface{

    @Override
    public void learn() {

    }
}
class Main{
    public static void main(String[] args) {
       MyClass myClass = new MyClass();

    }
}
