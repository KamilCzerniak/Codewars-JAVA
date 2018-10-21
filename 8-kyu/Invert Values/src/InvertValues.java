import java.util.Arrays;

public class InvertValues {

    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(i -> -i).toArray();
    }

    public static void main(String[] args) {

    }
}
