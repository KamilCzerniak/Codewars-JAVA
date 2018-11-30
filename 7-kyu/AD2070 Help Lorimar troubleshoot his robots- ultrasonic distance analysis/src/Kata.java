import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Kata {
    public static double[] sensorAnalysis(Object[][] sensor_data) {
        double[] temp = Arrays.stream(sensor_data).mapToDouble(d -> (double) d[1]).toArray();
        double mean = DoubleStream.of(temp).average().getAsDouble();
        double sd = Math.sqrt(DoubleStream.of(temp).map(d -> Math.pow(d - mean, 2) / (temp.length - 1)).sum());
        return new double[]{Math.round(mean * 10000) / 10000.0, Math.round(sd * 10000) / 10000.0};
    }
}
