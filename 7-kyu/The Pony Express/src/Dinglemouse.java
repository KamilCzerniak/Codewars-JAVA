public class Dinglemouse {
    public static int riders(final int[] stations) {
        int riders = 1;
        int sum = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            sum += stations[i];
            if (sum + stations[i + 1] > 100) {
                riders++;
                sum = 0;
            }
        }
        return riders;
    }
}
