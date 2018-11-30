import java.util.function.IntUnaryOperator;

public class AdderFactory {
    public static IntUnaryOperator create(int addTo) {
        return p -> p + addTo;
    }
}