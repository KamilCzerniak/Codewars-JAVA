import java.util.Arrays;
public class Kata {

    public static String formatWords(String[] words) {
        if (words == null) {
            return "";
        }
        String[] temp = Arrays.stream(words).filter(s -> s.length() > 0).toArray(String[]::new);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i]).append(i == temp.length - 2 ? " and " : i < temp.length - 2 ? ", " : "");

        }
        return sb.toString();
    }

}