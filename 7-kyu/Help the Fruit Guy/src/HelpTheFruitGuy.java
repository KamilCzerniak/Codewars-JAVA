import java.util.Arrays;

public class HelpTheFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        return fruitBasket == null || fruitBasket.length == 0 ? new String[]{} : Arrays.stream(fruitBasket)
                .map(s -> s.replace("rotten", "").toLowerCase())
                .toArray(String[]::new);
    }
}
