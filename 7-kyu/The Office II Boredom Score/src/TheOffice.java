import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheOffice {
    public static String boredom(Person[] staff) {

        Map<String, Integer> departments = new HashMap<>();
        departments.put("accounts", 1);
        departments.put("finance", 2);
        departments.put("canteen", 10);
        departments.put("regulation", 3);
        departments.put("trading", 6);
        departments.put("change", 6);
        departments.put("IS", 8);
        departments.put("retail", 5);
        departments.put("cleaning", 4);
        departments.put("pissing about", 25);

        int boredomScores = Arrays.stream(staff)
                .mapToInt(p -> departments.get(p.department))
                .sum();

        return boredomScores <= 80 ? "kill me now"
                : boredomScores < 100 ? "i can handle this"
                : "party time!!";
    }
}