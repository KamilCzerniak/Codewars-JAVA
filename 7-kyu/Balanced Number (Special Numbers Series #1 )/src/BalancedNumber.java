public class BalancedNumber {
    public static String balancedNum(long number) {
        String[] s = String.valueOf(number).split("");
        long left = 0;
        long right = 0;
        for (int i = 0; i < (s.length % 2 == 0 ? s.length / 2 - 1 : s.length / 2); i++) {
            left += Long.valueOf(s[i]);
            right += Long.valueOf(s[s.length - 1 - i]);
        }
        return left == right ? "Balanced" : "Not Balanced";
    }
}
