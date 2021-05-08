package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {

            System.out.println("count = " + count);
            count--;
        }
        System.out.println("finish the count");

        int unreadSMS = 10;
        System.out.println("i have total " + unreadSMS + " unreadsms");
        while (unreadSMS >= 1) {
            System.out.println("Reading SMS = " + unreadSMS);
            unreadSMS--;

        }
        System.out.println("no more unread SMS");
    }
}
