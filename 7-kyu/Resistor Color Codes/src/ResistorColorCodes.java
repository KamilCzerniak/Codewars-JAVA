import java.util.Arrays;
import java.util.List;

public class ResistorColorCodes {
    public static String decodeResistorColors(String bands) {

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
        String[] s = bands.split(" ");

        List<String> list = Arrays.asList(colors);
        double res = (10 * list.indexOf(s[0]) + list.indexOf(s[1])) * (int) Math.pow(10, list.indexOf(s[2]));
        String suffix = res < 1000 ? "" : res < 1000000 ? "k" : "M";
        res = res < 1000 ? res : res < 1000000 ? res / 1000 : res / 1000000;

        String resistance = res % 1 == 0 ? String.valueOf((int) res) : String.format("%.1f", res);
        String tolerance = s.length == 3 ? "20%" : s[3].equals("silver") ? "10%" : "5%";
        return String.format("%s%s ohms, %s", resistance, suffix, tolerance);
    }
}
