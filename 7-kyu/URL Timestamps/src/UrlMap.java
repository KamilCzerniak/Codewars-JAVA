import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class UrlMap {
    private Map<String, Long> map = new HashMap<>();


    public void setTimestamp(URL url, long timestamp) {
        map.put(url.toString(), timestamp);
    }

    public long getTimestamp(URL url) {
        return map.getOrDefault(url.toString(), -1L);
    }
}
