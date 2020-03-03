package Labs4;

public class Main {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.addProduct(new Mobile("Apple", "0333333", 2019));
        mb.guaranteeCheck();
    }
}
