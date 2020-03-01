package Interface;

public class Animal  implements  IRunning{
    @Override
    public void running() {
        System.out.println("Animal is running...");
    }
}
