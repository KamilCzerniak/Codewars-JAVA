import java.util.Arrays;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {

        return Arrays.stream(numbers).filter(d -> d % divider == 0).toArray();
    }
}
