import java.util.Arrays;

public class HowManyStairsWillSuzukiClimbIn20Years {
    public static long stairsIn20(int[][] stairs) {
        long oneYear = 0;
        for (int[] stair : stairs) {
            oneYear += Arrays.stream(stair).sum();
        }
        return oneYear * 20;
    }
}
