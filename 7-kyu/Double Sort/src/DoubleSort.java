import java.util.stream.Stream;

public class DoubleSort {
    public static Object[] dbSort(Object[] a) {

        return Stream.concat(Stream.of(a).filter(x -> x instanceof Integer).sorted()
                , Stream.of(a).filter(y->y instanceof String).sorted()).toArray();
    }
}
