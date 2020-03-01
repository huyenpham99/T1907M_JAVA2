package JAVA2_SS1;

public class Calculator {

    public static float devide(float x, float y) throws DevideByZeroException {
        if (y==0){
            throw new DevideByZeroException(x,y);
        }
        return x / y;
    }

    public float plus(float x, float y) {
        return (int) (x + y);
    }
}
