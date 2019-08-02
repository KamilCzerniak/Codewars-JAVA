import java.util.ArrayList;
import java.util.List;

public class TheOffice {
    public static Object meeting(Room[] x, int need) {

        int chairs = 0;
        int freeChairs;

        List<Integer> list = new ArrayList<>();

        if (need == 0) {
            return "Game On";
        }
        for (Room room : x) {

            int temp = room.chairs - room.occupants.length();

            freeChairs = temp > 0 ? temp : 0;
            chairs += freeChairs;

            list.add(freeChairs);

            if (chairs == need) {
                return list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
            }
        }
        return "Not enough!";
    }
}