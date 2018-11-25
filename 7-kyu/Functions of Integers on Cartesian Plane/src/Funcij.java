import java.math.BigInteger;
import java.util.stream.LongStream;

public class Funcij {

    public static BigInteger sumin(int n) {
        return BigInteger.valueOf(LongStream.rangeClosed(1, n).map(i -> i * ((n - i) * 2 + 1)).sum());
    }

    public static BigInteger sumax(int n) {
        return BigInteger.valueOf(LongStream.rangeClosed(1, n).map(i -> i * (i * 2 - 1)).sum());
    }

    public static BigInteger sumsum(int n) {
        return sumin(n).add(sumax(n));
    }
}
