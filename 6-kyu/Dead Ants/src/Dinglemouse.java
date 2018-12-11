
import java.util.stream.IntStream;

public class Dinglemouse {

    public static int deadAntCount(final String ants) {
        if (ants == null) {
            return 0;
        }
        String ant = "ant";
        String graveyard = ants.replace(ant, "");
        int[] cnt = new int[3];
        for (int i = 0; i < cnt.length; i++) {
            char letter = ant.charAt(i);
            cnt[i] = (int) graveyard.chars().filter(c -> c == letter).count();
        }
        return IntStream.of(cnt).max().getAsInt();

    }
}