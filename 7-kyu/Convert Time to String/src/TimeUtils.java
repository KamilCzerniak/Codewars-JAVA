public class TimeUtils {
    public static String convertTime(int timeDiff) {
        int sec = timeDiff % 60;
        int min = (timeDiff / 60) % 60;
        int hour = (timeDiff / 3600) % 24;
        int day = (timeDiff) / 86400;
        return String.format("%s %s %s %s", day, hour, min, sec);
    }
}
