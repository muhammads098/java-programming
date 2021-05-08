package day38_methods;

public class StringUtilsTest {
    public static void main(String[] args) {
        String userName="";
        if (StringUtils.isNullOrEmpty((userName))){
            System.out.println("FAIL: UserName cannot be null or empty");
        }
        System.out.println("isPalindrome(civic) = "+StringUtils.isPalindrome("civic"));
        System.out.println("is palindrome(honda) = "+StringUtils.isPalindrome("honda"));
        System.out.println("is palindrome(kayak) = "+StringUtils.isPalindrome("kayak"));

        String word="sunday";
        String revWord=StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);

    }
}
