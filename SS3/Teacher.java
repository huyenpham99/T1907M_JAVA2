package SS3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("aa");
        stringArrayList.add("bb");
        stringArrayList.add("cc");
        stringArrayList.add("aa");
        System.out.println("In ra arrayList: ");
        for (String s : stringArrayList) {
            System.out.println(s);
        }
        stringArrayList.remove(0);
        HashSet<String> stringHashSet = new HashSet<>();
        //sẽ không trùng lặp
        stringHashSet.add("aa");
        stringHashSet.add("bb");
        stringHashSet.add("cc");
        stringHashSet.add("aa");
        System.out.println("In ra HashSet: ");
        for (String s : stringHashSet) {
            System.out.println(s);
        }
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        //cho vào sẽ có sự sắp xếp, nhưng vẫn dc trùng nhau
        priorityQueue.add("Nguyen van c");
        priorityQueue.add("Nguyen van d");
        priorityQueue.add("Nguyen van a");
        priorityQueue.add("Nguyen van b");
        priorityQueue.add("Nguyen van h");
        System.out.println("In ra priorityQueue: ");
        for (String s : priorityQueue) {
            System.out.println(s);
        }
        //cách lấy ra sử dụng priority queue:

        for (; priorityQueue.isEmpty();){
            System.out.println(priorityQueue.poll());
            System.out.println("kich thuoc: " + priorityQueue.size());
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Phong_cua_Linh", "Phong 10m2");
        hashMap.put("Phong_cua_VA", "phong 12m2");
        hashMap.put("Phong_cua_Huyen", "Phong 8m2");
        hashMap.put("Phong_cua_Nhan", "5m2");
        //key - value 1 cặp
        System.out.println("phong cua ban Linh" + hashMap.get("Phong_cua_Linh"));
        //lấy theo key là: Phong_cua_Linh
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(0, "Xin chao thu 4");
        hashMap1.put(5, "Xin chao thu 7");
        System.out.println(hashMap1.get(0));
    }

    @Override
    public String toString() {
        return "Hello";
    }
}
