public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        return Integer.bitCount(gcd(Math.abs(x), Math.abs(y)));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
