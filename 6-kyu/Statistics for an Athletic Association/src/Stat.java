import java.util.Arrays;
import java.util.stream.IntStream;

public class Stat {

    public static String stat(String strg) {

        if (strg.length() == 0) {
            return "";
        }

        String[] array = strg.split(",");
        int[] time = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            String[] temp = array[i].trim().split("\\|");
            time[i] = Integer.valueOf(temp[0]) * 3600 + Integer.valueOf(temp[1]) * 60 + Integer.valueOf(temp[2]);
        }
        Arrays.sort(time);
        int range = IntStream.of(time).max().getAsInt() - IntStream.of(time).min().getAsInt();
        int median = time.length % 2 != 0
                ? time[time.length / 2]
                : (time[time.length / 2] + time[(time.length / 2 - 1)]) / 2;
        int mean = (int) IntStream.of(time).average().getAsDouble();


        return String.format("Range: %s Average: %s Median: %s"
                , getFormattedTime(range)
                , getFormattedTime(mean)
                , getFormattedTime(median));
    }

    public static String getFormattedTime(int time) {
        int sec = time % 60;
        int min = (time / 60) % 60;
        int hours = time / 3600;

        return String.format("%02d|%02d|%02d", hours, min, sec);
    }
}