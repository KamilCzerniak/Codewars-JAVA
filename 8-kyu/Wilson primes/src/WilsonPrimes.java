import java.math.BigInteger;

public class WilsonPrimes {

    public static boolean am_i_wilson(int n) {
        if (n > 1) {
            return ((factorial(BigInteger.valueOf(n - 1)).add(BigInteger.ONE))
                    .mod(BigInteger.valueOf(n * n))).equals(BigInteger.ZERO);
        }
        return false;
    }

    public static BigInteger factorial(BigInteger n) {
        return n.equals(BigInteger.ZERO) ? BigInteger.ONE : factorial(n.subtract(BigInteger.ONE)).multiply(n);
    }

}
