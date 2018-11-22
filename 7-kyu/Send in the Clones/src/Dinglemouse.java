public class Dinglemouse {
    public static long[] clonewars(final int kataPerDay) {
        return new long[]{(long) Math.ceil(Math.pow(2, kataPerDay - 1))
                , (long) Math.pow(2, kataPerDay + 1) - kataPerDay - 2};

    }
}
