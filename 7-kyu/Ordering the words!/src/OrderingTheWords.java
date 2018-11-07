import java.util.Arrays;
import java.util.stream.Collectors;

public class OrderingTheWords {
    public static String orderWord(String s) {
        if (s != null && s.length() != 0) {
            return Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
        }
        return "Invalid String!";
    }
}
