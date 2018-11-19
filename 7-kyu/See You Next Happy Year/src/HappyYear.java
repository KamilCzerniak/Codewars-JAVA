import java.util.Arrays;
import java.util.stream.Collectors;

public class HappyYear {
    static public int nextHappyYear(int year) {
        year++;
        while (Arrays.stream(String.valueOf(year).split(""))
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining()).length() != 4) {
            year++;
        }
        return year;
    }
}
