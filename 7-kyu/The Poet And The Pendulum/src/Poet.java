import java.util.Arrays;

public class Poet {
    public static int[] pendulum(final int[] values) {
        Arrays.sort(values);
        int[] res = new int[values.length];
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[values.length % 2 != 0 ? i / 2 : res.length - i / 2 - 1] = values[values.length - i - 1];
            } else {
                res[values.length % 2 != 0 ? res.length - i / 2 - 1 : i / 2] = values[values.length - i - 1];
            }
        }
        return res;
    }
}
