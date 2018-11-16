import java.util.Arrays;

public class Kata {
    public static int timedReading(final int maxLength, final String text) {
        return (int) Arrays.stream(text.replaceAll("[^a-zA-Z ]", "").split(" "))
                .filter(s -> s.length() <= maxLength && s.length() > 0).count();
    }
}
