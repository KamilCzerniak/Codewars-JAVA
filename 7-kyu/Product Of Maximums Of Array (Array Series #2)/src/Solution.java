import java.util.Arrays;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long result = 1;
        for (int i = numbers.length - sub_size; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }
}
