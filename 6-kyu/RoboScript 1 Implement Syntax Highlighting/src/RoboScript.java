import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoboScript {

    public static String highlight(String code) {

        List<String> list = new ArrayList<>();
        String[] arr = code.split("");
        StringBuilder temp = new StringBuilder(arr[0]);

        for (int i = 1; i < code.length(); i++) {

            if (temp.toString().contains(arr[i])
                    || Character.isDigit(temp.charAt(0)) && Character.isDigit(arr[i].charAt(0))) {
                temp.append(arr[i]);
            } else {
                list.add(temp.toString());
                temp = new StringBuilder(arr[i]);
            }
        }

        list.add(temp.toString());
        return list.stream()
                .map(s -> wrapCommand(s))
                .collect(Collectors.joining());

    }

    private static String wrapCommand(String s) {

        if (Character.isDigit(s.charAt(0))) {
            return String.format("<span style=\"color: orange\">%s</span>", s);
        }
        switch (s.charAt(0)) {
            case 'F':
                return String.format("<span style=\"color: pink\">%s</span>", s);
            case 'L':
                return String.format("<span style=\"color: red\">%s</span>", s);
            case 'R':
                return String.format("<span style=\"color: green\">%s</span>", s);
            default:
                return s;
        }
    }
}


