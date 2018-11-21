import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {
    public static String createAcronym(String lastName, String firstName) {
        return Arrays.stream((firstName + " " + lastName).split("\\s|-"))
                .map(e -> e.equalsIgnoreCase("von") ? "v" : String.valueOf(e.toUpperCase().charAt(0)))
                .collect(Collectors.joining());

    }
}
