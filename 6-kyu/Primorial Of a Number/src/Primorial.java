import java.math.BigInteger;

public class Primorial {
    public static String numPrimorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; n > 0; i++) {
            if (isPrime(i)) {
                result = result.multiply(BigInteger.valueOf(i));
                n--;
            }
        }
        return result.toString();
    }

    private static boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}