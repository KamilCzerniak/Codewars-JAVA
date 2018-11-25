import java.util.stream.Collectors;

public class Kata {
    public static String broken(final String x) {
        return x.chars().map(c -> c == '1' ? '0' : '1')
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
