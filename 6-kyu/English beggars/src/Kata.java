public class Kata {
    public static int[] beggars(int[] values, int n) {

        if (n == 0) {
            return new int[]{};
        }
        int[] res = new int[n];
        for (int i = 0; i < values.length; i++) {
            res[i % n] += values[i];
        }
        return res;
    }
}