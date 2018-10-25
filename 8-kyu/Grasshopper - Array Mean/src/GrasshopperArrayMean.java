import java.util.Arrays;

public class GrasshopperArrayMean {

    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().getAsDouble();
    }
}
