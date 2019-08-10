import java.util.Collections;

public class RunLengthEncoding {
    public static String encode(String input) {

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            char x = input.charAt(i);
            char y = input.charAt(i + 1);
            if (x != y) {
                sb.append(cnt).append(x);
                cnt = 0;
            }
            cnt++;
        }
        sb.append(cnt).append(input.charAt(input.length() - 1));

        return sb.toString();
    }

    public static String decode(String input) {

        String[] cnt = input.split("[A-Z]");
        String[] letter = input.replaceAll("[0-9]", "").split("");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt.length; i++) {
            sb.append(String.join(""
                    , Collections.nCopies(Integer.valueOf(cnt[i])
                            , "" + letter[i])));
        }
        return sb.toString();
    }
}
