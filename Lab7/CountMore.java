package Lab7;

public class CountMore implements Runnable {

    Runnable r1 = () -> {
        int count1 =10;
        for (int i =count1; i>0;i--){
            System.out.println(i);
            try {
                java.lang.Thread.sleep(60000);
            }catch (Exception e){

            }
        }
    };


    @Override
    public void run() {

    }

    Runnable r2 = () -> {
        int count2 =10;
        for (int j =count2; j>0;j--){
            System.out.println(j);
            try {
                java.lang.Thread.sleep(60000);
            }catch (Exception e){

            }
        }
    };

}
