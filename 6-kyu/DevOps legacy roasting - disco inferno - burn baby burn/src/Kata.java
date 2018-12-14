import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String roastLegacy(String workloads) {
        Map<String, Integer> map = new HashMap<>();
        map.put("cobol", 1000);
        map.put("nonobject", 500);
        map.put("monolithic", 500);
        map.put("fax", 100);
        map.put("modem", 100);
        map.put("thickclient", 50);
        map.put("tape", 50);
        map.put("floppy", 50);
        map.put("oldschoolit", 50);

        String[] complain = {"slow!", "expensive!", "manual!", "down!", "hostage!", "security!"};
        
        int points = map.entrySet()
                .stream()
                .mapToInt(a -> (workloads.length() - workloads.toLowerCase().replace(a.getKey(), "").length()) / a.getKey().length() * a.getValue())
                .sum();

        int complaints = Arrays.stream(complain)
                .mapToInt(a -> (workloads.length() - workloads.toLowerCase().replace(a, "").length()) / a.length())
                .sum();

        return points == 0 && complaints == 0
                ? "These guys are already DevOps and in the Cloud and the business is happy!"
                : String.format("Burn baby burn disco inferno %d points earned in this roasting and %d complaints resolved!"
                , points
                , complaints);

    }
}