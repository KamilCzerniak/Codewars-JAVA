import java.math.BigInteger;

public class Prime {
    public static boolean isPrime(int num) {
        return num > 0 && BigInteger.valueOf(num).isProbablePrime(1);
    }
}