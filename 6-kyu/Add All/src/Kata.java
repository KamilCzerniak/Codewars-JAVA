import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Kata {
    public static int addAll(final int[] numbers) {
        int cost;
        int res = 0;
        PriorityQueue<Integer> queue = IntStream.of(numbers).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        while (queue.size() > 1) {
            cost = queue.remove() + queue.remove();
            res += cost;
            queue.add(cost);
        }
        return res;
    }
}