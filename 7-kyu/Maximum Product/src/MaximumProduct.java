import java.util.Arrays;

public class MaximumProduct {
    public int adjacentElementsProduct(int[] array) {
        int[] a = new int[array.length - 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = array[i] * array[i + 1];
        }
        return Arrays.stream(a).max().getAsInt();
    }
}
