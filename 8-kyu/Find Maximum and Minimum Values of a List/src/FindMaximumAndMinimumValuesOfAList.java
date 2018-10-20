import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfAList {

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public static void main(String[] args) {

    }
}
