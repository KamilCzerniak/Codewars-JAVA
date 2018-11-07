import java.util.Arrays;

public class MinimizeSumOfArrayArraySeries {
    public static int minSum(int[] passed) {

        int sum = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - 1 - i];
        }
        return sum;
    }
}

