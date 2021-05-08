package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words="java,python,selenium,html";
        String[] wordsArray=words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);

        for (String each:wordsArray){
            System.out.println(each);
        }


        String sentence="today i am coding java arrays";
        String[] sentenceArray=sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray.length);

        for (String only:sentenceArray){
            System.out.println(only);
        }

    }
}
