package Assignment3_Ver2;

import java.util.ArrayList;

public class PersonModel<Person> {
    ArrayList<Person> personList = new ArrayList<>();

    public void addNewPerson(Person person) {
        personList.add(person);
    }

    public void showInfo() {
        for (Person p : personList) {
            System.out.println(p.toString());
        }
    }
}
