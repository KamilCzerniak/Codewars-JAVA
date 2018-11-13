import java.time.LocalDate;

public class Kata {
    public static int unluckyDays(int year) {

        int cnt = 0;
        for (int month = 1; month < 13; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek().getValue() == 5) {
                cnt++;
            }
        }
        return cnt;
    }
}
