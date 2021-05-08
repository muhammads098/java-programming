package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean freeShipping=true;
        boolean onSale=true;
        String itemName="Wooden Spoon";

        if (onSale&&freeShipping){
            System.out.println("Adding to Cart-"+ itemName);
        }else {
            System.out.println("Continue shopping for good deals on-" +itemName);
        }
        if (freeShipping&&onSale&&itemName.equals("Wooden Spoon")){
            System.out.println("Adding to cart"+ itemName);
        }else {
            System.out.println("Continue shopping for good deals-"+ itemName);
        }

    }
}
