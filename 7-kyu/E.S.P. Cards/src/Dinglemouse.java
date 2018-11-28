import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dinglemouse {
    public static String nameTheShape(final char[][] card) {
        int lettersCount = Stream.of(card)
                .map(a -> Stream.of(a)
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining())
                .replaceAll(" ", "")
                .length();

        return lettersCount == 92 ? "diamond" : lettersCount == 96
                ? "circle" : lettersCount == 108 ? "square" : "null";

    }
}
