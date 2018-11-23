import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        return Stream.concat(Stream.of(first), Stream.of(second))
                .flatMapToInt(Arrays::stream)
                .distinct()
                .sorted()
                .toArray();
    }
}
