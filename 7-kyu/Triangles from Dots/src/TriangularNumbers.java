import java.math.BigInteger;

public class TriangularNumbers {
    public static BigInteger numberOfDots(BigInteger n) {
        return ((BigInteger.valueOf(1).add(n)).multiply(n)).divide(BigInteger.valueOf(2));
    }
}
