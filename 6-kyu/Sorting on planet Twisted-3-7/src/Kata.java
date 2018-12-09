import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array).sorted(Comparator.comparingInt(a -> Integer.valueOf(String.valueOf(a)
                .replace("7", "$")
                .replace("3", "7")
                .replace("$", "3"))))
                .toArray(Integer[]::new);
    }
}
