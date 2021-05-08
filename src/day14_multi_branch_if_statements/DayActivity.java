package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather="sunny";
        if (weather.equals("sunny")){
            System.out.println("Go to park, hiking,and code java");
        }else if (weather.equals("rainy")) {
                System.out.println("stay home,drink tea,and code java");

            }else if (weather.equals("snowy")) {
                System.out.println("CLean the car then build snowman and code java");

                }else if (weather.equals("windy")) {
            System.out.println("get ready for power loss and fly kite, code java");
        }else {
            System.out.println("Just keep coding java");



        }


    }
}
