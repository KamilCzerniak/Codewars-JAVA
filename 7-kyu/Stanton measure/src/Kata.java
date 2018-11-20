import java.util.stream.IntStream;

public class Kata {
    public static int stantonMeasure(int[] arr) {
        int n = (int) IntStream.of(arr)
                .filter(j -> j == 1)
                .count();

        return (int) IntStream.of(arr)
                .filter(i -> i == n)
                .count();
    }
}
