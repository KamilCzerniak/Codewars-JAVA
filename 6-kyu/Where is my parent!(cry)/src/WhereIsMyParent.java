import java.util.Arrays;
import java.util.stream.Collectors;

public class WhereIsMyParent {
    static String findChildren(final String text) {
        return Arrays.stream(text.split(""))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
    }
}
