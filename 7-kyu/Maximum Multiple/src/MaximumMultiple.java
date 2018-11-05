public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        return bound % divisor == 0 ? bound : maxMultiple(divisor, bound - 1);
    }
}
