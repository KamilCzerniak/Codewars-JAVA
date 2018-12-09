import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;

public class Operarray {
    public static long gcdi(long x, long y) {
        return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue();
    }

    public static long lcmu(long a, long b) {
        return Math.abs(a * b) / BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return Math.max(a, b);
    }

    public static long mini(long a, long b) {
        return Math.min(a, b);
    }

    public static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
        long[] res = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = operator.applyAsLong(i == 0 ? init : res[i - 1], arr[i]);
        }
        return res;
    }
}