import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String swap(String st) {
        return Arrays.stream(st.split(""))
                .map(s -> s.matches("[aeiou]") ? s.toUpperCase() : s)
                .collect(Collectors.joining(""));
    }
}
