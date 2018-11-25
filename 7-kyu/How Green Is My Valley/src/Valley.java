import java.util.Arrays;

public class Valley {
    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int i = 0;
        while (i < result.length) {
            if (i % 2 == 0) {
                result[i / 2] = arr[result.length - 1 - i];
            } else {
                result[result.length - 1 - i / 2] = arr[result.length - 1 - i];
            }
            i++;
        }
        return result;
    }
}