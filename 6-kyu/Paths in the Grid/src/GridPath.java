import java.math.BigInteger;

public class GridPath {

    public static BigInteger numberOfRoutes(int m, int n) {
        return factorial(m + n).divide(factorial(m).multiply(factorial(n)));
    }

    private static BigInteger factorial(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));

    }
}
