import java.util.Arrays;

public class WallyFinder {
    public static int wheresWally(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("Wally([^0-9a-zA-Z]+.*)?")) {
                return Arrays.stream(array, 0, i)
                        .map(String::length)
                        .mapToInt(Integer::valueOf).sum() + array[i].indexOf("Wally") + i;
            }
        }
        return -1;
    }
}
