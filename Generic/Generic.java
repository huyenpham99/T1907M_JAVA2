package Generic;

public class Generic <K, V> {
    public K name;
    public V phone;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getPhone() {
        return phone;
    }

    public void setPhone(V phone) {
        this.phone = phone;
    }

    public <E> void showMessage(E msg) {
        System.out.println(msg);
    }

}
