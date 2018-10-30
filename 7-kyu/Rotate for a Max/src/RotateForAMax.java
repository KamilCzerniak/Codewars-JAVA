import java.util.Arrays;
import java.util.stream.Collectors;

public class RotateForAMax {
    public static long maxRot(long n) {
        int[] array = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .toArray();
        long[] numbers = new long[array.length];
        numbers[0] = n;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i];
            for (int j = i; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
            numbers[i + 1] = Long.parseLong(Arrays.stream(array)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }
        return Arrays.stream(numbers).max().getAsLong();
    }
}
