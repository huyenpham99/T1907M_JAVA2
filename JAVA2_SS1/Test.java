package JAVA2_SS1;

public class Test {
    public static void main(String[] args) {
        float sum ;
        try {
            sum = Calculator.devide(5, 10);
            System.out.println("Sum=" + sum);
        } catch (DevideByZeroException ex){
            System.out.println(ex.getMessage());
        }

    }
}
