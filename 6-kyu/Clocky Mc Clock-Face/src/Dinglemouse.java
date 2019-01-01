public class Dinglemouse {

    public static String whatTimeIsIt(final double angle) {
        int minutes = (int) (angle * 2) % 60;
        int hours = (int) angle / 30;
        return String.format("%02d:%02d", hours == 0 ? 12 : hours, minutes);
    }
}