import java.util.stream.IntStream;

public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
        return (int) (((3L + numbers.length) * numbers.length + 2) / 2) - IntStream.of(numbers).sum();
    }
}