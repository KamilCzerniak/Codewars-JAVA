import java.math.BigInteger;

class SumFractions {
    public static String sumFracts(int[][] l) {

        if (l == null || l.length == 0) {
            return null;
        }

        int numerator = l[0][0];
        int denominator = l[0][1];

        for (int i = 1; i < l.length; i++) {
            numerator = numerator * l[i][1] + denominator * l[i][0];
            denominator *= l[i][1];
        }
        return numerator % denominator == 0
                ? String.valueOf(numerator / denominator)
                : String.format("[%d, %d]"
                , numerator / gcd(numerator, denominator)
                , denominator / gcd(numerator, denominator));
    }

    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}