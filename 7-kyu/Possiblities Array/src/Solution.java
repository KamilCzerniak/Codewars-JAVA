import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        Arrays.sort(arg);
        return arg.length != 0 && Arrays.equals(IntStream.range(0, arg.length).toArray(), arg);
    }
}
