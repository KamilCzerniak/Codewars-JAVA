import java.util.Arrays;

public class BrokenSequence {

    public static int findMissingNumber(String sequence) {

        if (sequence.length() == 0) {
            return 0;
        } else if (sequence.replaceAll("[\\d\\s]", "").length() != 0) {
            return 1;
        }

        int[] array = Arrays.stream(sequence.split(" ")).mapToInt(Integer::valueOf).sorted().toArray();
        for (int i = 1; i <= array.length; i++) {
            if (array[i - 1] != i) {
                return i;
            }
        }
        return 0;
    }
}
