package PRACTICAL;

import java.util.ArrayList;

public class Menu extends MenuContact {
    ArrayList<Contact> list = new ArrayList<>();

    @Override
    public void addNewContact(String name, String company, String email, String phone) {
        list.add(new Contact(name, company, email, phone));
    }

    @Override
    public Contact searchContact(String name) {
        for (Contact c : list) {
            if (c.name.equals(name)) {
                System.out.println("Search Result: ");
                System.out.println(c.toString());
                return c;

            }
            System.out.println("Not Found!");
        }
        return null;
    }

    @Override
    public void Display() {
        System.out.println("Contact List: ");
        for (int i = 0; i < list.size(); i++) {
            Contact nameAddressBooks = list.get(i);
            System.out.println(nameAddressBooks.toString());
        }
    }
}
