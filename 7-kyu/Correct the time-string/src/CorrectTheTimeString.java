import java.util.Arrays;

public class CorrectTheTimeString {
    public static String timeCorrect(String timestring) {

        if (timestring != null && timestring.length() != 0 && timestring.matches("\\d{2}:\\d{2}:\\d{2}")) {
            int[] array = Arrays.stream(timestring.split(":")).mapToInt(Integer::valueOf).toArray();
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > 59) {
                    array[i] %= 60;
                    array[i - 1]++;
                }
            }
            array[0] %= 24;
            return String.format("%02d:%02d:%02d", array[0], array[1], array[2]);
        }
        return null;
    }
}
