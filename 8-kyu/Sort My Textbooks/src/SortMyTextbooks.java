import java.util.Comparator;
import java.util.List;

public class SortMyTextbooks {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(Comparator.naturalOrder());
        return textbooks;
    }
}
