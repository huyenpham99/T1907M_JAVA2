package Labs4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mobile {
    String brand;
    String seri;
    int year;

    public Mobile() {
    }

    public Mobile(String brand, String seri, int year) {
        this.brand = brand;
        this.seri = seri;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    ArrayList<Mobile> mobileList = new ArrayList<>();

    public void addProduct(Mobile mobile) {
        mobileList.add(mobile);
    }

    public boolean guaranteeCheck() {
        LocalDate now = LocalDate.now();
        for (Mobile mb : mobileList) {
            if (mb.year < now.getYear()) {
                System.out.println(mb.toString());
                System.out.println("Sản phẩm hết hạn bảo hành");
                return false;
            } else {
                System.out.println(mb.toString());
                System.out.println("Sản phẩm còn hạn bảo hành ");
            }

        }
        return true;
    }
}
