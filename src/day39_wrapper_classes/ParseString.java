package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total="345";
        int count=Integer.parseInt(total);
        System.out.println(count);

        String strPrice = "123.99";
        double count1 = Double.parseDouble(strPrice);
        if (count1>100){
            System.out.println("Expensive");
            System.out.println(count1);
        }
        String sentence="I wrote 100 lines of code";
        // split by space, parse index 2 to int
        String[] words =sentence.split(" ");
        int linesOfCode=Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}
