import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MakeBackronym {
    private static Map<String, String> dictionary = Preload.dictionary;

    public static String makeBackronym(String acronym) {

        return acronym.length() > 0 ? Arrays.stream(acronym.split(""))
                .map(s -> dictionary.get(s.toUpperCase()))
                .collect(Collectors.joining(" ")) : "";
    }
}
