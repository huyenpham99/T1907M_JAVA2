package PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class PhoneBook extends Phone {
    List<NamePhone> phoneList = new ArrayList<>();
    NamePhone namePhone = null;


    @Override
//    void insertPhone(String name, String number) {
//
//        int kt1 = 0, kt2 = 0;
//        for (int i = 0; i < phoneList.size(); i++) {
//            NamePhone namePhone = phoneList.get(i);
//            if (namePhone.getName().equals(name)) {
//                String[] listPhoneNumber = namePhone.getNumber().split("\\s:\\s");  // cat chuoi trong so dien thoai
//                for (String s : listPhoneNumber) {
//                    if (s.equals(number)) {
//                        kt1 = 1;
//                        break;
//                    }
//                }
//                kt2 = 1;
//            }
//
//        }
//
//
//        if (kt1 == 1 && kt2 == 1)
//            System.out.println("Nhap ten va sdt bi trung!");
//        else if (kt1 == 0 && kt2 == 0) {
//            this.namePhone = new NamePhone(name, number);
//            phoneList.add(namePhone);
//        } else if (kt1 == 0 && kt2 == 1) {
//
//            namePhone.setNumber(namePhone.getNumber() + " : " + number);
//        }
//    }

    public void insertPhone(String name, String phone) {
        int count = 0;
        if (phoneList.isEmpty()) {
            NamePhone namePhone = new NamePhone(name, phone);
            phoneList.add(namePhone);

        } else {
            count = findindex(name);
            if (count < 0) {
                phoneList.add(new NamePhone(name, phone));
                showListPhone();
            } else {
                if ((phoneList.get(count).getNumber()).equals(phone)) {
                    System.out.println("Da ton tai");
                } else {
                    phoneList.get(count).setNumber(phoneList.get(count).getNumber() + ":" + phone);
                    System.out.println("update xong roi");
                }
            }
        }
    }

    @Override
    void removePhone(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            NamePhone namePhone = phoneList.get(i);
            if (namePhone.getName().equals(name)) {
                phoneList.remove(i);
                System.out.println("Contact: " + namePhone.getName() + " xóa thành công!");
            }
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i = 0; i < phoneList.size(); i++) {
            NamePhone namePhone = phoneList.get(i);
            if (namePhone.getName().equals(name)) {
                namePhone.setNumber(newphone);
                System.out.println("Contact : " + namePhone.getName() + "update thanh cong!");
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            NamePhone namePhone = phoneList.get(i);
            if (namePhone.getName().equals(name)) {
                System.out.println("Tên vừa tìm kiếm: " + " Name: " + namePhone.getName() + " | Phone: " + namePhone.getNumber());
            }
        }

    }

    @Override
    void sort() {
        Collections.sort(phoneList, new Comparator<NamePhone>() {  // so sanh trong arraylist

            @Override
            public int compare(NamePhone o1, NamePhone o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
    }

    void showListPhone() {
        System.out.println("Danh sach contact:");
        for (int i = 0; i < phoneList.size(); i++) {
            NamePhone namePhone = phoneList.get(i);
            System.out.println("Name : " + namePhone.getName() + ", Phone: " + namePhone.getNumber());
        }
    }
    public int findindex(String ten) {

        for (int i = 0; i < phoneList.size(); i++) {
            if ((phoneList.get(i).getName()).equals(ten)) {
                return i;//tim thay tra ve chi so index
            }
        }
        return -1;

    }
}