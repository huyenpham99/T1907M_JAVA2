package Lab7;

public class CountDownThread extends Thread {
    public static void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                java.lang.Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println("Hết giờ");
    }

}