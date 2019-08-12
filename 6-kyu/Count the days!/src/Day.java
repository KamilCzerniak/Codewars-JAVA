import java.util.Date;

public class Day {

    public String countDays(Date d) {

        long diff = (d.getTime() - new Date().getTime()) / 86400000;
        return diff < 0 ? "The day is in the past!" : diff == 0 ? "Today is the day!" : diff + " days";
    }
}