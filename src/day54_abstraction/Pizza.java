package day54_abstraction;

public class Pizza extends MenuItem{


    @Override
    public void prepare() {
        System.out.println("stretch the dough and put toppings and cheese and put in oven ");
    }

    @Override
    public void serve() {
        System.out.println("serve inn plate or box");
    }
}
