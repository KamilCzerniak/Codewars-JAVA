public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        return y == 0 ? x : compute(y, x % y);
    }
}
