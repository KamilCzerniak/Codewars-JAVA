import java.util.ArrayList;
import java.util.List;

public class TheOffice {
    public static Object meeting(Room[] x, int need) {

        if (need == 0) {
            return "Game On";
        }

        List<Integer> list = new ArrayList<>();
        for (Room room : x) {
            int temp = Math.min(need, Math.max(0, room.chairs - room.occupants.length()));
            need -= temp;
            list.add(temp);
            if (need == 0) {
                return list.stream().mapToInt(Integer::valueOf).toArray();
            }

        }

        return "Not enough!";
    }
}