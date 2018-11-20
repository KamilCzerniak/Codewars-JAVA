import java.util.ArrayList;
import java.util.List;

public class Hexadecimal {

    public static String convertToHex(int a) {
        List<String> list = new ArrayList<>();
        while (a > 0) {
            if (a % 16 > 9) {
                list.add(0, String.valueOf((char) (a % 16 - 10 + 'A')));
            } else {
                list.add(0, String.valueOf(a % 16));
            }
            a /= 16;
        }
        return "0x" + String.join("", list);
    }
}
