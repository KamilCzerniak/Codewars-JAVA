public class HerosRoot {
    public static long IntRac(long n, long guess) {
        long prev = 0;
        long x = guess;
        long cnt = 0;
        while (Math.abs(prev - x) >= 1) {
            prev = x;
            x = (long) Math.floor(((x + (double) n / x) / 2.0));
            cnt++;
        }
        return cnt;
    }
}
