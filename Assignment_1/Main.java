package Assignment_1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        System.out.println("Nhập phân số 1 : ");
        f1.nhapPhanSo();
        System.out.println("Nhập phân số 2: ");
        f2.nhapPhanSo();
        System.out.print("Phân số 1 : ");
        f1.inPhanSo();
        System.out.print("Phân số 2: ");
        f2.inPhanSo();
        f1.add(f2);
        f1.sub(f2);
        f1.mul(f2);
        f1.div(f2);
    }
}
