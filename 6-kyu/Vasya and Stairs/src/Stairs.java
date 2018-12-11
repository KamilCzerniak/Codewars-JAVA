import java.util.stream.IntStream;

public class Stairs {
    public static int NumberOfSteps(int n, int m) {
        return IntStream.rangeClosed((int) Math.ceil(n / 2.0), n)
                .filter(i -> i % m == 0)
                .findFirst()
                .orElse(-1);
    }
}