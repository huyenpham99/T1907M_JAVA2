package Generic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Generic g = new Generic();

        g.showMessage("Good morning");
        g.showMessage(18);
        g.showMessage(g);

        Generic<String, Integer> g2 = new Generic<String, Integer>();
        g2.setName("Quang hoa");
        g2.setPhone(8888);
        Generic<Integer, Double> g3 = new Generic<Integer, Double>();
        //String Interger Double
        ArrayList<String> arrayList;
        HashSet<Double> doubles;
        PriorityQueue<Queue> stringPriorityQueue;
        HashMap<String, Integer> stringIntegerHashMap;
        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add("Hello");
        //Up casting -->ep kieu nguoc len
        //Down casting -->ep kieu xuoi xuong
        //Class B extends A
        //B obj -->Casting sang kieu A -->up casting
        //A obj -->Casting sang kieu B -->down casting


    }
}
