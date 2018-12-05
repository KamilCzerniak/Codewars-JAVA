import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Kata
{
    public static String sortTheInnerContent(String words)
    {
        return Arrays.stream(words.split(" ")).map(s -> s.length() > 3 ? String.valueOf(s.charAt(0)) +
                s.substring(1, s.length() - 1)
                        .chars()
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::valueOf)
                        .mapToObj(c->String.valueOf((char)c))
                        .collect(Collectors.joining()) +
                s.charAt(s.length() - 1)
                : s).collect(Collectors.joining(" "));
    }
}