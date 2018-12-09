import java.util.Map;
import java.util.stream.Collectors;

public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {

        String temp = presetColors.getOrDefault(color.toLowerCase(), color);
        int[] res = new int[3];

        if (temp.length() == 4) {
            temp = temp.chars()
                    .mapToObj(c -> Character.isLetterOrDigit((char) c)
                            ? String.valueOf((char) c) + String.valueOf((char) c)
                            : String.valueOf((char) c))
                    .collect(Collectors.joining());
        }

        for (int i = 1; i <= temp.length() - 2; i += 2) {
            res[i / 2] = Integer.parseInt(temp.substring(i, i + 2), 16);
        }

        return new RGB(res[0], res[1], res[2]);
    }
}
