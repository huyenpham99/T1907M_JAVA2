package Assignment3;

import java.util.ArrayList;

public class PersonModel<Person> {
    ArrayList<Person> listPerson = new ArrayList<>();

    public void addNewPerson(Person person) {
        listPerson.add(person);
    }

    public void disPlay() {
        System.out.println("Danh sách: ");
        for (Person s : listPerson) {
            System.out.println(s.toString());
        }
    }
}
