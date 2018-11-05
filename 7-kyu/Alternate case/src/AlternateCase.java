import java.util.Arrays;
import java.util.stream.Collectors;

public class AlternateCase {
    static String alternateCase(final String string) {
        if (string.length() != 0) {
            return Arrays.stream(string.split(""))
                    .map(c -> Character.isUpperCase(c.charAt(0)) ? c.toLowerCase() : c.toUpperCase())
                    .collect(Collectors.joining(""));
        }
        return string;
    }
}
