import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Kata {


    public static String[] mostFrequentDays(int year) {

        Map<DayOfWeek, Integer> map = new HashMap<>();
        LocalDate localDate = LocalDate.of(year, 1, 1);

        while (localDate.getYear() == year) {

            map.putIfAbsent(localDate.getDayOfWeek(), 0);
            map.put(localDate.getDayOfWeek(), map.get(localDate.getDayOfWeek()) + 1);
            localDate = localDate.plusDays(1);
        }

        int max = map.values().stream().mapToInt(Integer::intValue).max().orElse(0);

        return map.entrySet()
                .stream()
                .filter(a -> a.getValue() == max)
                .sorted(Comparator.comparingInt(a -> a.getKey().getValue()))
                .map(a -> a.getKey().name())
                .map(s -> s.charAt(0) + s.substring(1).toLowerCase())
                .toArray(String[]::new);

    }
}