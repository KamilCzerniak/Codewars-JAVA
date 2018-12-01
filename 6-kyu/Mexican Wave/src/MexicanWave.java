import java.util.ArrayList;
import java.util.List;
public class MexicanWave {

    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                list.add(str.substring(0, i) + str.toUpperCase().charAt(i) + str.substring(i + 1));
            }
        }
        return list.toArray(new String[0]);
    }

}