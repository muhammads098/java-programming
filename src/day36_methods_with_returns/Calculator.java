package day36_methods_with_returns;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,20));
        double sum=add(2,3);
        System.out.println("sum = "+sum);
        System.out.println("100 + 200 = "+add(100,200));

        System.out.println(minus(10,3));

        System.out.println(multiply(10,2));

        System.out.println(divide(40,5));

    }
    public static double add(double num1,double num2){
        double result=num1+num2;
        return result;
    }
    public static double minus(double num1,double num2){
        double result=num1-num2;
        return result;
    }
    public static double multiply(double num1,double num2){
        double result=num1*num2;
        return result;
    }
    public static double divide(double num1,double num2){
        double result= num1/num2;
        return result;

    }
}
