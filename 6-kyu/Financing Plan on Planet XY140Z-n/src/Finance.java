import java.math.BigInteger;

public class Finance {
    public static BigInteger finance(int n) {

        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i <= n; i++) {
            res = res.add(BigInteger.valueOf(i * 2 + n + i).multiply(BigInteger.valueOf(n + 1 - i)).divide(BigInteger.valueOf(2)));
        }
        return res;
    }
}
