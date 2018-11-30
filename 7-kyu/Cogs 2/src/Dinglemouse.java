public class Dinglemouse {

    public static double[] cogRpm(final int[] cogs, final int n) {

        double speedFirst = ((double) cogs[n] / cogs[0]);
        double speedLast = ((double) cogs[n] / cogs[cogs.length - 1]);
        return new double[]{n % 2 == 0 ? speedFirst : -speedFirst
                , (cogs.length - 1 - n) % 2 == 0 ? speedLast : -speedLast};
    }

}