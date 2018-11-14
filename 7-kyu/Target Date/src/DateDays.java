import java.time.LocalDate;

public class DateDays {
    public static String dateNbDays(double a0, double a, double p) {
        LocalDate date = LocalDate.of(2016, 1, 1);
        double result = a0;
        int days = 0;
        while (result < a) {
            result += result * (p / 36000);
            days++;
        }
        return date.plusDays(days).toString();
    }
}
