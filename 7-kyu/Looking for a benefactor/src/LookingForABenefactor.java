import java.util.Arrays;

public class LookingForABenefactor {
    public static long newAvg(double[] arr, double navg) {
        long result = (long) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }
}
