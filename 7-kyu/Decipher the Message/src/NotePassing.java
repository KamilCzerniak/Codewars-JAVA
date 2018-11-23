import java.util.Arrays;
import java.util.stream.Collectors;

public class NotePassing {
    public static String decipher(String codedMessage) {
        return codedMessage.length() != 0 ? Arrays.stream(codedMessage.split("")).map(c -> Character.isUpperCase(c.charAt(0))
                ? String.valueOf((char) ((65 + ((c.charAt(0) - 58) % 26))))
                : Character.isLowerCase(c.charAt(0))
                ? String.valueOf((char) ((97 + ((c.charAt(0) - 90) % 26))))
                : c).collect(Collectors.joining()) : "";
    }
}

