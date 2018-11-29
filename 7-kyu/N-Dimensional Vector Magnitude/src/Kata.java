import java.util.stream.DoubleStream;

public class Kata {
    public static double magnitude(double[] vector) {
        return Math.sqrt(DoubleStream.of(vector).map(d -> Math.pow(d, 2)).sum());
    }
}
