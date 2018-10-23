import java.util.Arrays;

public class BeginnerLostWithoutAMap {

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }

    public static void main(String[] args) {

    }
}
