import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

public class Rainfall {

    public static double mean(String town, String strng) {
        Map<String, double[]> map = getMap(strng);
        if (!map.containsKey(town)) {
            return -1;
        }
        double[] result = map.get(town);
        return DoubleStream.of(result).average().getAsDouble();
    }

    public static double variance(String town, String strng) {
        Map<String, double[]> map = getMap(strng);
        if (!map.containsKey(town)) {
            return -1;
        }
        double[] result = map.get(town);
        double mean = DoubleStream.of(result).average().getAsDouble();
        return DoubleStream.of(result).map(d -> Math.pow(d - mean, 2)).sum() / result.length;
    }

    public static Map<String, double[]> getMap(String strng) {

        Map<String, double[]> map = new HashMap<>();
        String[] temp = strng.split("\n");
        for (String string : temp) {
            String[] array = string.split(":");
            map.put(array[0], Arrays.stream(array[1].split(","))
                    .mapToDouble(s -> Double.valueOf(s.replaceAll("[^\\d.]", ""))
                    ).toArray());
        }
        return map;
    }
}
