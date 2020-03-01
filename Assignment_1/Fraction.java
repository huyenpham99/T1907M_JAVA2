package Assignment_1;

import java.util.Scanner;

public class Fraction {
    private int tu, mau;

    public Fraction(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public Fraction() {

    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số:");
        tu = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        mau = sc.nextInt();
    }
    public  void inPhanSo() {
        System.out.println("Phân số bạn vừa nhập: " + getTu() + "/" + getMau());
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutgonPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void add(Fraction ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.rutgonPhanSo();
        System.out.println("Kết quả khi cộng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void sub(Fraction ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.rutgonPhanSo();
        System.out.println("Kết quả khi trừ hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void mul(Fraction ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.rutgonPhanSo();
        System.out.println("Kết quả khi nhân hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    public void div(Fraction ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.rutgonPhanSo();
        System.out.println("Kết quả khi chia hai phân số  = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }

}

