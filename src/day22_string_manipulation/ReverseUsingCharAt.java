package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word1="Anna";
        System.out.print(word1.charAt(3));
        System.out.print(word1.charAt(2));
        System.out.print(word1.charAt(1));
        System.out.println(word1.charAt(0));
        System.out.println(word1);
        System.out.println(""+word1.charAt(3)+word1.charAt(2)+ word1.charAt(1)+ word1.charAt(0));

        String word2=""+word1.charAt(3)+word1.charAt(2)+ word1.charAt(1)+ word1.charAt(0);
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Palindrome word");
        }else{
            System.out.println("not Palindrome words");
        }






    }
}
