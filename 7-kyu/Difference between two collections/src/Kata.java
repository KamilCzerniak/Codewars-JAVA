import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        List<Character> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        return c.stream().filter(e -> !a.contains(e) || !b.contains(e))
                .distinct().sorted().collect(Collectors.toList());
    }
}
