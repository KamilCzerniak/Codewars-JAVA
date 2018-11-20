import java.util.Arrays;

public class Solution {
    public static long[] productArray(int[] numbers) {
        long product = Arrays.stream(numbers)
                .mapToLong(Long::valueOf)
                .reduce(1, (a, b) -> a * b);
        return Arrays.stream(numbers)
                .mapToLong(Long::valueOf)
                .map(l -> product / l).toArray();
    }
}
