import java.util.Arrays;

public class LostNumberInNumberSequence {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr).sum() - Arrays.stream(mixedArr).sum();
    }
}
