package Lab7;

public class Thread {
    public static void main(String[] args) {
        CountDownThread cdt = new CountDownThread();
        CountMore cm = new CountMore();
        Runnable r1 = () -> {
            int count1 = 10;
            int count2 = 60;
            for (int i = count1; i > 0; i--) {
                for (int j = count2; j > 0; j--) {
                    System.out.println(i + ":" + j);
                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                }
            }
        };
        new java.lang.Thread(r1).start();
    }


}
