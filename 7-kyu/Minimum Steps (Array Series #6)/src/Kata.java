import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int cnt = 0;
        int sum = numbers[0];
        while (sum < k) {
            sum += numbers[1 + cnt++];
        }
        return cnt;
    }
}
