public class CookingTime {

    public static String getTime(String neededPower, int minutes, int seconds, String power) {

        int result = (int) Math.ceil((Double.valueOf(neededPower.replace("W", ""))
                / Double.valueOf(power.replace("W", ""))) * (minutes * 60 + seconds));
        return String.format("%d minutes %d seconds", result / 60, result % 60);
    }
}
