import java.util.Arrays;

public class Solution {
    public static boolean isAlt(String word) {
        return Arrays.stream(word.split("[aeiou]")).noneMatch(s -> s.length() > 1)
                || Arrays.stream(word.split("[^aeiou]")).noneMatch(s -> s.length() > 1);
    }
}