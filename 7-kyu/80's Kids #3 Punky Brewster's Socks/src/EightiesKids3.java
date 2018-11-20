import java.util.Arrays;

public class EightiesKids3 {
    public static String[] getSocks(String name, String[] socks) {

        for (int i = 0; i < socks.length; i++) {
            String first = socks[i];
            String second = Arrays.stream(socks, i + 1, socks.length)
                    .filter(s -> name.equals("Henry") == s.equals(first))
                    .findFirst()
                    .orElse("");
            if (second.length() != 0) {
                return new String[]{first, second};
            }
        }
        return new String[]{};
    }
}
