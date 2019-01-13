import java.util.Arrays;

public class UpsideDown {

    public int solve(int x, int y) {
        int cnt = 0;
        for (int i = x; i < y; i++) {
            if (isRotatable(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean isRotatable(int num) {
        if (Arrays.stream(String.valueOf(num).split("")).anyMatch(a -> a.matches("[23457]"))) {
            return false;
        }
        int rotated = Integer.parseInt(new StringBuilder("" + num)
                .reverse()
                .toString()
                .replace("6", "#")
                .replace("9", "6")
                .replace("#", "9"));
        return num == rotated;
    }
}