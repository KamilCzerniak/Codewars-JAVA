import java.math.BigInteger;

public class LargeSum {
    public static String firstTenDigitsOfSum(String[] numbers) {
        BigInteger bi = BigInteger.ZERO;
        for (String digit : numbers) {
            bi = bi.add(new BigInteger(digit));
        }
        return bi.toString().substring(0, 10);
    }
}
