import java.util.Arrays;

public class Kata {

    public static int[] splitAndAdd(int[] numbers, int n) {

        for (int i = 0; i < n && numbers.length > 1; i++) {
            for (int j = 0; j < Math.floor(numbers.length / 2.0); j++) {
                numbers[numbers.length - 1 - j] += numbers[numbers.length - j - (int) Math.ceil(numbers.length / 2.0) - 1];
            }
            numbers = Arrays.copyOfRange(numbers, numbers.length - (int) Math.ceil(numbers.length / 2.0), numbers.length);

        }
        return numbers;
    }
}