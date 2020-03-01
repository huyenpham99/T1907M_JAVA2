package Lab4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mobile<S, T, N> {
    public S brandName;
    public T seri;
    public N year;

    public Mobile() {
    }

    public Mobile(S brandName, T seri, N year) {
        this.brandName = brandName;
        this.seri = seri;
        this.year = year;
    }

    public S getBrandName() {
        return brandName;
    }

    public void setBrandName(S brandName) {
        this.brandName = brandName;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }

    public boolean checkGuarantee() {
        LocalDate madeYear = LocalDate.of((Integer) year, 1, 1);
        LocalDate now = LocalDate.now();
        if ((Integer) year < (now.getYear() - 5)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Java Time
        LocalDate lc = LocalDate.now();
        LocalDate lc2 = LocalDate.of(2019, 2, 28);
        LocalDate lc3 = LocalDate.of(2020, 2, 29);
        LocalDate lc5 = lc3.minusYears(1);
        System.out.println("LC5:" + lc5);
        LocalDate lc4 = LocalDate.parse("2019-04-22");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        //ngay gio hien tai
        LocalDateTime dt2 = LocalDateTime.of(2020, 1, 30, 12, 30, 45);
        LocalDateTime.parse("2020-02-28T11:16:19.687");
        System.out.println("Nhap nam can kiem tra:"  );
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LocalDate kt = LocalDate.of(x, 2,28);
        LocalDate nextDay = kt.plusDays(1);
        if (nextDay.getDayOfMonth() ==29){
            //nam nhuan
        }
    }
}
