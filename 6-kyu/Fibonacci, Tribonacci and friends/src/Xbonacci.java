import java.util.Arrays;
import java.util.stream.DoubleStream;
public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i < signature.length
                    ? signature[i]
                    : DoubleStream.of(Arrays.copyOfRange(result, i - signature.length, i)).sum();
        }
        return result;
    }
}