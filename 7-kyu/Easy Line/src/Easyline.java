import java.math.BigInteger;

public class Easyline {
    public static BigInteger easyLine(int n) {
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i <= n; i++) {
            result = result.add(binomialCoefficient(n, i).pow(2));
        }
        return result;
    }

    public static BigInteger binomialCoefficient(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }
}
