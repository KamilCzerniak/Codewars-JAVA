import java.util.*;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(e -> e.getValue() > 60)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
