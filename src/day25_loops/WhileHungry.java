package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry=true;
        int bananas=0;
        int countToFull=3;

        while (isHungry){
            bananas++;
            System.out.println("eating a banana "+bananas);
            if (bananas==countToFull){
                isHungry=false;
            }

        }
        System.out.println("im not hungry anymore, lets get back to java");
    }
}
