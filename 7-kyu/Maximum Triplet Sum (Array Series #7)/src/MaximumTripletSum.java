import java.util.Arrays;

public class MaximumTripletSum {
    public static int maxTriSum(int[] numbers) {

        int[] a = Arrays.stream(numbers).distinct().sorted().toArray();
        return a[a.length - 1] + a[a.length - 2] + a[a.length - 3];
    }
}
