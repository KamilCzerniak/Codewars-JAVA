public class IsNdivisibleBy {
    public static boolean isDivisible(int... digit) {
        for (int i = 1; i < digit.length; i++) {
            if (digit[i] == 0 || digit[0] % digit[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
