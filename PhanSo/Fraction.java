package PhanSo;

import java.util.Scanner;

public class Fraction {
    public int tu_so;
    public int mau_so;

    public Fraction() {
    }

    public Fraction(int mau_so) {
        this.mau_so = mau_so;
    }

    public int getTu_so() {
        return tu_so;
    }

    public void setTu_so(int tu_so) {
        this.tu_so = tu_so;
    }

    public int getMau_so() {
        return mau_so;
    }

    public void setMau_so(int mau_so) {
        this.mau_so = mau_so;
    }

    public void inputFraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        setTu_so(sc.nextInt());
        System.out.println("Nhap mau so:");
        int ms = sc.nextInt();
        setMau_so(ms != 0 ? ms : 1);

    }

    public void printFraction() {
        System.out.println(getTu_so() + "/" + getMau_so());

    }

    public void compactFraction() {

    }

    public int ucln() {
        int ts = Math.abs(getTu_so());
        int ms = Math.abs(getMau_so());
        int ucln = 1;
        for (int i = 1; i <= Math.min(ts, ms); i++) {
            if (ts % i == 0 && ms % i == 0) {
                ucln = 1;
            }
        }
        return ucln;
    }

    public void inversetFraction() {
        if (getTu_so() != 0) {
            int tmp = getTu_so();
            setTu_so(getMau_so());
            setMau_so(tmp);
        } else {
            System.out.println("Khong the dao nguoc phan so");
        }
    }

    public Fraction addFraction(Fraction fr) {
        Fraction rs = new Fraction();
        rs.setMau_so(this.getMau_so() * fr.getMau_so());
        rs.setTu_so(this.getTu_so() * fr.getMau_so() + this.getMau_so() * fr.getTu_so());
        return rs;
    }

    public Fraction subFraction(Fraction fr) {
        Fraction rs = new Fraction();
        rs.setMau_so(this.getMau_so() * fr.getMau_so());
        rs.setTu_so(this.getTu_so() * fr.getMau_so() - this.getMau_so() * fr.getTu_so());
        return rs;

    }

}