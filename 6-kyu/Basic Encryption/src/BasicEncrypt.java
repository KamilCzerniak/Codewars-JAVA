import java.util.stream.Collectors;

public class BasicEncrypt {

    public String encrypt(String text, int rule) {
        return text.chars().mapToObj(a -> String.valueOf((char) ((a + rule) % 256))).collect(Collectors.joining());
    }
}