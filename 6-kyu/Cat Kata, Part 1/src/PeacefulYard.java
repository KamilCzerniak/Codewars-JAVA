import java.util.ArrayList;
import java.util.List;

public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length(); j++) {
                if (yard[i].charAt(j) != '-') {
                    list.add(new int[]{j, i});
                }
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int[] a = list.get(i);
                int[] b = list.get(j);
                if (Math.sqrt(Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2)) < minDistance) {
                    return false;
                }
            }
        }
        return true;
    }
}
