import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DrivingLicence {
    public static String driver(final String[] data) {

        StringBuilder sb = new StringBuilder("99999");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
        LocalDate inputDate = LocalDate.parse(data[3].substring(0, 6) + data[3].substring(data[3].length() - 5), dtf);
        sb.replace(0, Math.min(data[2].length(), 5), data[2].substring(0, Math.min(data[2].length(), 5)))
                .append(String.format("%d%02d%02d%d%s%s"
                        , inputDate.getYear() % 100 / 10
                        , data[4].equals("F") ? inputDate.getMonthValue() + 50 : inputDate.getMonthValue()
                        , inputDate.getDayOfMonth()
                        , inputDate.getYear() % 10
                        , data[0].charAt(0)
                        , data[1].length() > 0 ? data[1].charAt(0) : "9"))
                .append("9")
                .append("AA");

        return sb.toString().toUpperCase();
    }
}
