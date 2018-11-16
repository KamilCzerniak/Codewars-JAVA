import java.util.stream.IntStream;

public class Solution {
    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number)
                .filter(i -> i % 2 != 0)
                .toArray();
    }
}
