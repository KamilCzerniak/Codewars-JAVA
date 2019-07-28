import java.util.stream.IntStream;

public class Solution {

    public static int duplicates(int[] array) {

        int[] temp = IntStream.of(array).distinct().toArray();

        int cnt = 0;
        for (int num : temp) {
            cnt += (int) IntStream.of(array).filter(x -> x == num).count() / 2;
        }
        return cnt;
    }

}