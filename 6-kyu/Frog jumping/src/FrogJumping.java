import java.util.ArrayList;
import java.util.List;
public class FrogJumping {

    public static int solution(int[] a) {
        if (a.length == 0) {
            return -1;
        } else if (a[0] < 0) {
            return 1;
        }
        List<Integer> indexes = new ArrayList<>();
        indexes.add(0);
        int jump = 0;
        for (int i = 0; i >= 0 && i < a.length; jump++) {
            i += a[i];
            if (indexes.contains(i)) {
                return -1;
            }
            indexes.add(i);
        }
        return jump;
    }
}