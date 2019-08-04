public class FuscFun {

    public static int closestEvenFusc(int n) {

        while (fusc(n) % 2 != 0) {
            n++;
        }
        return n;
    }

    private static int fusc(int n) {

        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return fusc(n / 2);
        } else {
            return fusc((n - 1) / 2) + fusc((n + 1) / 2);
        }
    }
}
