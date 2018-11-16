import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static String[] sortCards(String[] cards) {
        String order = "A23456789TJQK";
        Arrays.sort(cards, Comparator.comparingInt(order::indexOf));
        return cards;
    }
}
