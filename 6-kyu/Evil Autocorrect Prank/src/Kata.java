import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static String autocorrect(String input) {
        return Arrays.stream(input.split(" "))
                .map(s -> s.toLowerCase()
                        .matches("(yo)u+[?.,!]?|u[?.,!]?")
                        ? "your sister" + s.replaceAll("[A-Za-z]","") : s)
                .collect(Collectors.joining(" "));
    }
}
