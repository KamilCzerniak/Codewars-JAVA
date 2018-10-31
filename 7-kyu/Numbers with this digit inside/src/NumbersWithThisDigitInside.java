
public class NumbersWithThisDigitInside {
    public static long[] NumbersWithDigitInside(long x, long d) {

        long cnt = 0;
        long sum = 0;
        long product = 1;
        for (int i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                cnt++;
                sum += i;
                product *= i;
            }
        }
        return cnt > 0 ? new long[]{cnt, sum, product} : new long[]{0, 0, 0};
    }
}
