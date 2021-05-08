package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters= new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));

        System.out.println("Size = "+letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("Reversed = "+letters);
        System.out.println(Collections.frequency(letters,'a'));
        
        int vCount=Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = "+Collections.max(letters));
        System.out.println("Min char = "+Collections.min(letters));

        Collections.reverse(letters);

        Collections.replaceAll(letters, 'a','u');
        System.out.println("After Replace = "+letters);

        Collections.sort(letters);
        System.out.println("After Sort = "+letters);

     List<Integer> nums= Arrays.asList(23,1,43,5,234,7,-9,0,1,5,5,5,5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = "+nums);

        int max=Collections.max(nums);
        int min=Collections.min(nums);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

       int countOfFives= Collections.frequency(nums,5);
        System.out.println("Count of Fives = "+countOfFives);

        int countOfOnes=Collections.frequency(nums,1);
        System.out.println("Count of ones = "+countOfOnes);

        Collections.replaceAll(nums,5,50);
        System.out.println("After replaceAll = "+nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("After Reverse Sort = "+nums);

        Collections.shuffle(nums);
        System.out.println("After Shuffle = "+ nums);





    }
}
