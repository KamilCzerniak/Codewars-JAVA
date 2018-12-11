import java.util.Arrays;
import java.util.stream.Collectors;

public class MissingAlphabet {

    public static String insertMissingLetters(String str) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        for (int i = 0; i < s.length(); i++) {
            String character = String.valueOf(s.charAt(i));
            str = str.replaceFirst(character
                    , character + alphabet.substring(alphabet.indexOf(character))
                            .replaceAll("[" + s + "]", "").toUpperCase());
        }
        return str;
    }
}