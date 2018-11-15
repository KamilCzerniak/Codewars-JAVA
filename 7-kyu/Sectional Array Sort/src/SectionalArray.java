import java.util.Arrays;

public class SectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        Arrays.sort(array, start, length.length == 0
                ? array.length
                : Math.min(array.length, start + length[0]));
        return array;
    }
}
