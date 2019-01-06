import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Binder<T, I> {
    public List<I> bind(List<T> list, Function<T, List<I>> func) {
        return list
                .stream()
                .flatMap(a -> func.apply(a).stream())
                .collect(Collectors.toList());
    }
}