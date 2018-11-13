import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(0, numbers.length - 1)
                .map(i -> numbers[i + 1] - numbers[i])
                .max().getAsInt();
    }
}
