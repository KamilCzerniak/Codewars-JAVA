import java.time.LocalDate;

public class Kata {
    public static String ageInDays(int year, int month, int day) {
        return String.format("You are %s days old", LocalDate.now().toEpochDay() - LocalDate.of(year, month, day).toEpochDay());
    }
}
