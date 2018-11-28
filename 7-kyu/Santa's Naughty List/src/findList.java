import java.util.List;
import java.util.stream.Collectors;

public class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return santasList.stream().filter(children::contains).distinct().sorted().collect(Collectors.toList());
    }
}
