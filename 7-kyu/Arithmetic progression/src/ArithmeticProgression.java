public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        if (total == 1) {
            return String.valueOf(first);
        }
        return String.valueOf(first) + ", " + arithmeticSequenceElements(first += step, step, total - 1);
    }
}
