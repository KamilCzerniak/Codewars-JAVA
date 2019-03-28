import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static long arrayPacking(int[] arr) {

        return Long.parseLong(IntStream.range(0, arr.length)
                .mapToObj(i -> Integer.toBinaryString(arr[arr.length - i - 1]))
                .map(s -> "00000000".substring(0, 8 - s.length()) + s)
                .collect(Collectors.joining("")), 2);
    }

    public static void main(String[] args) {
        System.out.println(arrayPacking(new int[]{255, 255, 255, 255}));
    }

}
