package JAVA2_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.remove("A2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //cach2
        for (String item : list) {
            System.out.println(item);
        }
        //cach 3:
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
