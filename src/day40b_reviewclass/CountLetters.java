package day40b_reviewclass;

public class CountLetters {
    public static void main(String[] args) {
        String str = "apple tree";


        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char eachOtherLetter = str.charAt(j);

                if (eachLetter==eachOtherLetter){
                    count++;
                }
            }
            System.out.println(eachLetter+" - "+count);
        }
    }
}