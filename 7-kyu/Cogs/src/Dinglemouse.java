public class Dinglemouse {
    public static double cogRpm(final int[] cogs) {
        double speed = (double) cogs[0] / cogs[cogs.length - 1];
        return cogs.length % 2 == 0 ? -speed : speed;
    }
}
