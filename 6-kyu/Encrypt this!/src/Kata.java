import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String encryptThis(String text) {

        return text.length() == 0 ? text : Arrays.stream(text.split(" "))
                .map(s -> "" + (int) s.charAt(0)
                        + (s.length() > 2 ? s.charAt(s.length() - 1)
                        + s.substring(2, s.length() - 1)
                        + s.charAt(1) : s.substring(1)))
                .collect(Collectors.joining(" "));
    }
}