import java.util.Arrays;

public class Solution {
    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        int median = numbers[numbers.length / 2];
        int mean = (int) Arrays.stream(numbers).average().getAsDouble();
        return median > mean ? "median" : mean > median ? "mean" : "same";
    }
}
