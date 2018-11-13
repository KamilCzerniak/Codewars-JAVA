import java.util.Arrays;

public class Solution {
    public static String disariumNumber(int number) {
        int sum = 0;
        int[] digit = Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::valueOf).toArray();
        for (int i = 1; i <= digit.length; i++) {
            sum += Math.pow(digit[i - 1], i);
        }
        return number == sum ? "Disarium !!" : "Not !!";
    }
}
