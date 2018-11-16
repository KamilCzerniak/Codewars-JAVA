public class Multiplier {
    public static int multiply(int a, int b) {
        int res = a * b;
        if (res != (long) a * b) {
            throw new ArithmeticException();
        }
        return res;
    }
}
