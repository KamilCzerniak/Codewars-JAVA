import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Kata {
    public static int[] menFromBoys(final int[] values) {
        return Stream.concat(IntStream.of(values)
                        .boxed()
                        .filter(i -> i % 2 == 0)
                        .sorted(),
                IntStream.of(values)
                        .boxed()
                        .filter(i -> i % 2 != 0)
                        .sorted(Comparator.reverseOrder()))
                .distinct()
                .mapToInt(Integer::valueOf)
                .toArray();

    }
}
