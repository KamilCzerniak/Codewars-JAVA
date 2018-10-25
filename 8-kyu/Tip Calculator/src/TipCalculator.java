import java.util.HashMap;
import java.util.Map;

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        Map<String, Double> map = new HashMap<>();
        map.put("terrible", 0.0);
        map.put("poor", 0.05);
        map.put("good", 0.1);
        map.put("great", 0.15);
        map.put("excellent", 0.2);
        return map.containsKey(rating.toLowerCase())
                ? (int) Math.ceil(amount * map.get(rating.toLowerCase()))
                : null;
    }
}
