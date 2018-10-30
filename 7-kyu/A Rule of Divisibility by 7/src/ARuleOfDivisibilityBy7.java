public class ARuleOfDivisibilityBy7 {
    public static long[] seven(long m) {

        int counter = 0;
        while (m > 99) {
            m = m / 10 - (m % 10) * 2;
            counter++;
        }
        return new long[]{m, counter};
    }
}
