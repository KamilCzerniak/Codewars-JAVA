import java.util.Arrays;

public class SortByBinaryOnes {
    public static Integer[] sort(Integer[] list) {
        Arrays.sort(list, (a, b) -> ((Integer.bitCount(a) == Integer.bitCount(b))
                && (Integer.toBinaryString(a).length() == Integer.toBinaryString(b).length()))
                ? a - b
                : Integer.bitCount(a) == Integer.bitCount(b)
                ? Integer.toBinaryString(a).length() - Integer.toBinaryString(b).length()
                : Integer.bitCount(b) - Integer.bitCount(a));
        return list;
    }
}
