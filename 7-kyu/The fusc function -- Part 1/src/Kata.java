public class Kata {
    public static int fusc(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return fusc(n / 2);
        }
        return fusc(n / 2) + fusc(n / 2 + 1);
    }
}
