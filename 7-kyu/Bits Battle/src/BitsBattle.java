import java.util.stream.IntStream;

public class BitsBattle {
    static String bitsBattle(int[] numbers) {
        int result = IntStream.range(0, numbers.length)
                .reduce(0, (a, b) -> a + (numbers[b] % 2 == 0 && numbers[b] != 0
                        ? Integer.bitCount(numbers[b]) - Integer.toBinaryString(numbers[b]).length()
                        : Integer.bitCount(numbers[b])));

        return result == 0 ? "tie" : result > 0 ? "odds win" : "evens win";
    }
}
