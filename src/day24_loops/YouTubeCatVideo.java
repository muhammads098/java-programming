package day24_loops;


public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Worlds smallest cat");
        int seconds = 0;
        while (seconds <= 117) {
            seconds++;
              Thread.sleep(1000);
            System.out.println("Watching youtube video: Second" + seconds);

        }
    }
}