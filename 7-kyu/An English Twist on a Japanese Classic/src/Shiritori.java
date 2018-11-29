import java.util.ArrayList;
import java.util.List;

public class Shiritori {
    public static List<String> theGame(List<String> words) {

        if (words.size() == 0 || words.get(0).length() == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        String temp = words.get(0);
        list.add(temp);
        for (int i = 1; i < words.size(); i++) {
            String next = words.get(i);
            if (next.length() == 0 || temp.charAt(temp.length() - 1) != next.charAt(0)) {
                break;
            }
            list.add(next);
            temp = next;
        }
        return list;
    }
}
