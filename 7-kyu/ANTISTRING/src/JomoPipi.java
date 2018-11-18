import java.util.stream.Collectors;

public class JomoPipi {
    public static String antiString(String str) {
        return new StringBuilder(str.chars().map(c -> Character.isLetter(c)
                ? 187 - c : 105 - c)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())).reverse().toString();
    }
}
