import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Leetspeak extends Encoder {

    public String encode(String source) {

        if (source == null) {
            return "";
        }

        Map<String, String> map = new HashMap<>();
        map.put("a", "4");
        map.put("e", "3");
        map.put("l", "1");
        map.put("m", "/^^\\");
        map.put("o", "0");
        map.put("u", "(_)");

        return Arrays.stream(source.split(""))
                .map(s -> map.getOrDefault(s.toLowerCase(), s))
                .collect(Collectors.joining());
    }
}