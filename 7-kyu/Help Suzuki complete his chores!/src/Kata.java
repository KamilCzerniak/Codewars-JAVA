import java.util.Arrays;

public class Kata {
    public static int[] choreAssignments(int[] chores) {
        int[] result = new int[chores.length / 2];
        Arrays.sort(chores);
        for (int i = 0; i < result.length; i++) {
            result[i] = chores[i] + chores[chores.length - 1 - i];
        }
        Arrays.sort(result);
        return result;
    }
}
