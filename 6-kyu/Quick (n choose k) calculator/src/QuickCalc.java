import java.math.BigInteger;

class QuickCalc {

    public static BigInteger choose(int n, int p) {
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < p; i++) {
            res = res.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        }
        return res;
    }
}