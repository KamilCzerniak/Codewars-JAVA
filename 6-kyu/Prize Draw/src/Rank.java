import java.util.*;
import java.util.stream.Collectors;

public class Rank {
    public static String nthRank(String st, Integer[] we, int n) {
        if (st.length() == 0) {
            return "No participants";
        } else if (n > we.length) {
            return "Not enough participants";
        }
        String[] temp = st.split(",");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            map.put(temp[i], (temp[i].length() + temp[i].toLowerCase().chars().map(c -> c - 'a' + 1).sum()) * we[i]);
        }
        Map<String, Integer> sortedMap = new ArrayList<>(map.entrySet())
                .stream()
                .sorted((a, b) -> !a.getValue().equals(b.getValue())
                        ? b.getValue().compareTo(a.getValue())
                        : a.getKey().compareToIgnoreCase(b.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey
                        , Map.Entry::getValue
                        , (a, b) -> a
                        , LinkedHashMap::new));

        return sortedMap.keySet().toArray(new String[0])[n - 1];
    }
}
