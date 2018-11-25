import java.util.Arrays;
import java.util.Comparator;


public class Solution {
    static String[] unusualLexOrder(String[] words) {
        Arrays.sort(words, Comparator.comparing(a -> new StringBuilder(a).reverse().toString()));
        return words;
    }
}
