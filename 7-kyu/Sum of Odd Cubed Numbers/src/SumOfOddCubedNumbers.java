import java.util.Arrays;

public class SumOfOddCubedNumbers {
    public static int cubeOdd(int arr[]) {

        return Arrays.stream(arr).filter(i -> i % 2 != 0).map(i -> (int) Math.pow(i, 3)).sum();
    }
}
