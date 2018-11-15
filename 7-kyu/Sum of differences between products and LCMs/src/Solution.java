import java.util.stream.IntStream;

public class Solution {

    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        return IntStream.range(0, pairs.length)
                .reduce(0, (a, b) -> a + (pairs[b][0] * pairs[b][1] == 0 ? 0
                        : pairs[b][0] * pairs[b][1] - (pairs[b][0] * pairs[b][1])
                        / gcd(pairs[b][0], pairs[b][1])));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
