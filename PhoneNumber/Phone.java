package PhoneNumber;

public abstract class Phone {
    abstract void insertPhone(String name, String number);

    abstract void removePhone(String name);

    abstract void updatePhone(String name, String newphone);

    abstract void searchPhone(String name);

    abstract void sort();
}
