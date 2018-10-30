public class SumOfNumbersFrom0ToN {
    public static String showSequence(int value) {
        if (value > 0) {
            String[] array = new String[value + 1];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = String.valueOf(i);
                sum += i;
            }
            return String.format("%s=%d", String.join("+", array), sum);
        }
        return value < 0 ? String.format("%d<0", value) : "0=0";
    }
}
