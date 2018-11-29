import java.util.stream.DoubleStream;

public class ParallelResistors {
    public static double resistance(double... resistor) {
        return 1 / DoubleStream.of(resistor).reduce(0, (a, b) -> a + 1 / b);
    }
}
