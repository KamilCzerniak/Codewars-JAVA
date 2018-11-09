import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {

        LocalTime inputTime = LocalTime.parse(time.substring(0, 2), DateTimeFormatter.ofPattern("HH"));
        int h = Integer.valueOf(inputTime.format(DateTimeFormatter.ofPattern("hh")));
        int min = Integer.valueOf(time.substring(time.length() - 2));

        if (min == 30) {
            return "Cuckoo";
        } else if (min == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < h; i++) {
                sb.append("Cuckoo").append(" ");
            }
            return sb.toString().trim();
        } else if (min % 3 == 0 && min % 5 == 0) {
            return "Fizz Buzz";
        } else if (min % 3 == 0) {
            return "Fizz";
        } else if (min % 5 == 0) {
            return "Buzz";
        } else {
            return "tick";
        }
    }
}
