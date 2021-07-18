import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println("set = " + set);

        Set<String> words= new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println("words = " + words);

        //convert tour Set to a List
        List<String>wordsList=new ArrayList<>(words);
        System.out.println(wordsList.get(0));




    }
}
