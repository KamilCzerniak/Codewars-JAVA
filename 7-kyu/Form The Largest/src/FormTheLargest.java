import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FormTheLargest {
    public static long maxNumber(long n) {

        return Long.valueOf(Arrays.stream(String.valueOf(n)
                .split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("")));
    }
}
