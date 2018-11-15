import java.util.Arrays;
import java.util.stream.Collectors;

public class ThinkingAndTesting {
    public static String testSomethingCapitalized(String s) {
        return s.length() == 0 ? s : Arrays.stream(s.split(" "))
                .map(i -> i.substring(0, i.length() - 1) + i.toUpperCase().charAt(i.length() - 1))
                .collect(Collectors.joining(" "));
    }
}
