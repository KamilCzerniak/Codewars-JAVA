import java.util.function.IntUnaryOperator;

public class FunctionalAddition {

    public static IntUnaryOperator add(int n) {
        return a -> a + n;
    }
}
