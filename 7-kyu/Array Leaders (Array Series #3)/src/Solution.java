import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static List arrayLeaders(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > IntStream.range(i + 1, numbers.length).reduce(0, (a, b) -> a + numbers[b])) {
                list.add(numbers[i]);
            }
        }
        return list;
    }
}
