import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        Integer[] array = new Integer[n];
        Arrays.fill(array, 0);
        Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(array));

        for (int time : customers) {
            queue.add(queue.remove() + time);
        }
        return queue.stream().mapToInt(Integer::valueOf).max().getAsInt();
    }
}
