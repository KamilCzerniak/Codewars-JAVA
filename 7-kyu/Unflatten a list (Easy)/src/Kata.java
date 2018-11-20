import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] flatArray) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] < 3) {
                list.add(flatArray[i]);
            } else if (flatArray[i] > 2) {
                list.add(Arrays.copyOfRange(flatArray, i, Math.min(i + flatArray[i], flatArray.length)));
                i += flatArray[i] - 1;
            }
        }
        return list.toArray();
    }
}
