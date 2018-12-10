import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CircleSorted {

    public boolean isCircleSorted(int[] a) {
        List<Integer> sorted = IntStream.of(a).sorted().boxed().collect(Collectors.toList());
        List<Integer> temp = IntStream.of(a).boxed().collect(Collectors.toList());

        for (int i = 0; i < temp.size(); i++) {
            if (sorted.equals(temp)) {
                return true;
            }
            Collections.rotate(temp, 1);
        }
        return false;
    }
}
