package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice=9;
        boolean isPrimeMember=true;
        if (isPrimeMember){
            System.out.println("Eligible for free 2day shipping");
        }else{
            if (itemPrice>=25.0){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not Eligible for free shipping. FEE= $10");
            }
        }

    }
}
