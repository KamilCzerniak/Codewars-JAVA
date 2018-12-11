import java.util.HashMap;
import java.util.Map;

public class JomoPipi {
    public static String numericals(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(arr[i], 0);
            map.put(arr[i], map.get(arr[i]) + 1);
            sb.append(map.get(arr[i]));
        }
        return sb.toString();
    }
}
