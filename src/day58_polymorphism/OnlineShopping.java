package day58_polymorphism;

public abstract class OnlineShopping {
    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping the purchased items");
    }
    public class Amazon extends OnlineShopping implements Prime{

        @Override
        public void buy() {
            System.out.println("Buying items on amazon.com");
        }

        @Override
        public void sell() {
            System.out.println("Selling items on amazon.com");
        }

        @Override
        public void primeShipping() {
            System.out.println("Free-2day shipping for prime users");
        }
    }
    public interface Prime{
         void primeShipping ();
    }


}
