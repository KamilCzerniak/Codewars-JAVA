import java.util.Comparator;
import java.util.Map;

public class EightiesKids1 {
    public static String totalLicks(Map<String, Integer> env) {
        int licks = 252 + env.values().stream().reduce(0, (a, b) -> a + b);
        if (!env.isEmpty() && env.values().stream().anyMatch(e -> e > 0)) {
            String key = env.entrySet().stream()
                    .filter(e -> e.getValue().equals(env.values()
                            .stream()
                            .max(Comparator.naturalOrder())
                            .get()))
                    .findFirst().get().getKey();
            return String.format("It took %d licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was %s.", licks, key);
        }
        return String.format("It took %d licks to get to the tootsie roll center of a tootsie pop.", licks);
    }
}
