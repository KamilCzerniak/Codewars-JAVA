import java.math.BigInteger;

class Disguised2 {

    public static BigInteger u1(int n, int p) {
        return (BigInteger.valueOf(n).multiply(BigInteger.valueOf(p)).add(BigInteger.valueOf(p)));
    }

    public static BigInteger v1(int n, int p) {
        return (BigInteger.valueOf(n).multiply(BigInteger.valueOf(p).multiply(BigInteger.valueOf(2))).add(BigInteger.valueOf(p)));
    }

    public static BigInteger uEff(int n, int p) {
        return u1(n, p);
    }

    public static BigInteger vEff(int n, int p) {
        return v1(n, p);
    }
}
