package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word="shoaib";
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
            System.out.println();

        }
        String word1="java";
        for (int i=3;i>=0;i--){
            System.out.print(word1.charAt(i));
        }

    }
}
