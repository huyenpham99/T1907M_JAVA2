package Ontap2;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList) {
            if (p.name.equals(phone)) {
                if (p.phone.equals(phone)) {
                    return;
                }
                p.phone = p.phone + " : " + phone;
                return;
            }
        }
        PhoneList.add( new PhoneNumber(name, phone));
    }

    @Override
    void removePhone(String name) {

    }

    @Override
    void updatePhone(String name, String newphone) {

    }

    @Override
    void searchPhone(String name) {

    }

    @Override
    void sort() {

    }
}
