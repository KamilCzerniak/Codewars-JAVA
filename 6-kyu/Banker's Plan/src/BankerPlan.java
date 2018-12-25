public class BankerPlan {

    public static boolean fortune(int f0, double p, int c0, int n, double i) {

        while (n > 0) {
            if (f0 < 0) {
                return false;
            }
            f0 += f0 * p / 100.0 - c0;
            c0 += c0 * i / 100.0;
            n--;
        }

        return true;
    }
}