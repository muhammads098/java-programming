package day11_comparasion_operators;

public class BooleanComparasionOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(985.44<98547.8);
        System.out.println(10<=9);
        System.out.println(-100!=44);

        int a =100;
        int b= 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        boolean result=5==5;
        System.out.println("result = " + result);
        result=33>44;
        System.out.println("result = " + result);
        result=88<99;
        System.out.println("result = " + result);
        result=10>=10;
        System.out.println("result = " + result);

        String city="Seattle";
        System.out.println("city== Seattle");
        System.out.println(city=="Baku");
        System.out.println(city!="Fairfax");

        String name="Nadir";
        boolean checkName= name== "Nadir";
        System.out.println("checkName= "+ checkName);
        




    }
}
