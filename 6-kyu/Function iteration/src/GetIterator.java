import java.util.function.Function;

public class GetIterator {
    public static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
        return num -> {
            for (int i = 0; i < times; i++) {
                num = func.apply(num);
            }
            return num;
        };
    }
}
