import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoCard {
    public static String[] getCard() {

        String bingo = "BINGO";
        String[] res = new String[24];
        Random random = new Random();
        int index = 0;
        for (int i = 0; i < bingo.length(); i++) {
            List<Integer> list = IntStream.rangeClosed(1 + i * 15, i * 15 + 15).boxed().collect(Collectors.toList());
            for (int j = 0; j < (i == 2 ? 4 : 5); j++) {
                res[index++] = "" + bingo.charAt(i) + list.remove(random.nextInt(15 - j));
            }

        }
        return res;
    }
}
