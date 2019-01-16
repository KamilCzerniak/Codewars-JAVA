import java.util.stream.IntStream;

public class BitWars {

    public static String bitsWar(int[] numbers) {
        int res = IntStream.of(numbers)
                .map(i -> i > 0 && i % 2 == 0 || i < 0 && i % 2 != 0
                        ? -Integer.bitCount(Math.abs(i))
                        : Integer.bitCount(Math.abs(i))).sum();
        return res < 0 ? "evens win" : res > 0 ? "odds win" : "tie";
    }
}