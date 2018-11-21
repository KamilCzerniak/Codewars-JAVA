import java.util.stream.IntStream;

public class Kata {
    public static int modifiedSum(int[] array, int power) {
        return IntStream.of(array).reduce(0, (a, b) -> a + ((int) Math.pow(b, power) - b));
    }
}
