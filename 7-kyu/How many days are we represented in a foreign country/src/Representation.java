import java.util.Arrays;
import java.util.stream.IntStream;

public class Representation {
    public static int daysRepresented(int[][] trips) {

        return (int) Arrays.stream(trips)
                .map(i -> IntStream.rangeClosed(i[0], i[1]))
                .flatMapToInt(i -> i)
                .distinct()
                .count();
    }
}
