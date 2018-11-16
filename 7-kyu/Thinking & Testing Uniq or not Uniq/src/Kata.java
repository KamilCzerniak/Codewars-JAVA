import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int[] testit(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a).distinct(), Arrays.stream(b).distinct())
                .sorted()
                .toArray();
    }
}
