import java.util.HashMap;
import java.util.Map;

public class Ransom {
    public static boolean canMakeNote(String note, String magazine) {

        String temp = magazine.toLowerCase().replaceAll(" ", "");
        String text = note.toLowerCase().replaceAll("[^a-z'0-9]", "");

        Map<String, String> map = new HashMap<>();
        map.put("a", "4");
        map.put("e", "3");
        map.put("i", "1");
        map.put("o", "0");
        map.put("s", "5");
        map.put("z", "2");

        for (String s:text.split("")) {

            if (!temp.contains(s)) {
                s = map.getOrDefault(s, s);
            }
            if (!temp.contains(s)) {
                return false;
            }
            temp = temp.replaceFirst(s, "");
        }
        return true;
    }
}
