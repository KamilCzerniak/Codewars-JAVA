import java.util.Arrays;

public class Solution {
    public static String match(int[] usefulness, int months) {
        return Arrays.stream(usefulness).sum() >= 100 * Math.pow(0.85, months) ? "Match!" : "No match!";
    }
}
