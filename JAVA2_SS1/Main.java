package JAVA2_SS1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[3]; //3 phan tu
        Scanner sc = new Scanner(System.in);
        try {
            //1000 connect neu gap loi o query thi se lam cham he thong

            //open connection
            //query
            //clodse connection
        } catch (Exception e) {

        } finally {
            //close connection
            //Tac dung cua finally???

        }


        try {
            int z = 5 / 0;
            //dua code dinh xu ly vao day
            for (int i = 0; i <= arr.length; i++) {
                System.out.printf("Nhap phan tu arr[%d]= ", i);
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
            //goi vao khi ct gap loi
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            //duoc goi la: khi chuogn trinh ko cos loi hoac co loi deu chay vao
            System.out.println("Finish 1");
        }
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish 1");
        }


    }
}

