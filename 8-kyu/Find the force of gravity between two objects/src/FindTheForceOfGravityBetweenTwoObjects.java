import java.util.HashMap;
import java.util.Map;

public class FindTheForceOfGravityBetweenTwoObjects {

    public static final double G = 6.67e-11;

    public static double solution(double[] arrVal, String[] arrUnit) {
        Map<String, Double> map = new HashMap<>();
        map.put("kg", 1.0);
        map.put("g", 1e-3);
        map.put("mg", 1e-6);
        map.put("μg", 1e-9);
        map.put("lb", 0.453592);
        map.put("m", 1.0);
        map.put("cm", 1e-2);
        map.put("mm", 1e-3);
        map.put("μm", 1e-6);
        map.put("ft", 0.3048);


        return G * arrVal[0] * map.get(arrUnit[0]) * arrVal[1] * map.get(arrUnit[1])
                / Math.pow((arrVal[2] * map.get(arrUnit[2])), 2);
    }

    public static void main(String[] args) {
        System.out.println(solution(new double[]{1000, 1000, 100}, new String[]{"g", "kg", "m"}));
    }
}
