package Ontap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookPhone extends Phone {
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();


    @Override
    public void insertPhone(String name, String phone) {
        //for(int i =0; i< phoneList.size(); i++){
        //phoneList.get(i);
        // }
        for (PhoneNumber p : phoneList) { //for each
            //p là đối tượng của phoneNumber
            //tương đương: PhoneList.get(i);

            if (p.name.equals(phone)) {
                if (p.phone.equals(phone)) {
                    return;
                }
                p.phone = p.phone + " : " + phone;
                return;
            }
        }
        phoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p : phoneList) {
            if (p.name.equals(name)) {
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber p : phoneList) {
            if (p.name.equals(name)) {
                p.phone = newphone;
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p : phoneList) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (PhoneNumber p : phoneList) {
            System.out.println(p.name + "  :  " + p.phone);
        }
    }
    void showListPhone() {
        System.out.println("Danh sach contact:");
        for (int i = 0; i < phoneList.size(); i++) {
            PhoneNumber namePhone = phoneList.get(i);
            System.out.println("Name : " + namePhone.getName() + ", Phone: " + namePhone.getPhone());
        }
    }
}
