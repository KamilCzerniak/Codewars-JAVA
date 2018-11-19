public class Kata {
    public static double getChance(int n, int x, int a) {
        double result = 1;
        for (int i = 0; i < a; i++) {
            result *= (double) (n - x - i) / (n - i);
        }
        return Math.round(result * 100) / 100.0;
    }
}
