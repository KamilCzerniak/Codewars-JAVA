public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        int result = 1;
        for (int d : x) {
            result *= d;
        }
        return result;
    }
}
