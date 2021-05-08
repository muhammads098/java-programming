package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word="github";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.replace("hub","lab"));
        word=word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('a', 'i'));

        String sentence="java is fun";
        String withNoSpaces=sentence.replace(" ","");
        System.out.println(withNoSpaces);
        sentence=sentence.replace("java","selenium").replace("fun","alot of fun");
        System.out.println(sentence);

        String result="1-48 pf over 4,000 results for java book";
        result = result.replace("1-48 of over", "")
                .replace(",", "")
                .replace("results for java book", "");
        System.out.println("result = " + result);




    }
}
