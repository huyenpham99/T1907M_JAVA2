package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IRunning> runningList = new ArrayList<>();
        runningList.add(new Student());
        runningList.add(new Student());
        runningList.add(new Animal());
        runningList.add(new Animal());
        for (int i =0; i<runningList.size(); i++){
            runningList.get(i).running();
        }
    }

}
//