import java.util.*;

public class Dinglemouse {

    public static class HelpSaveChristmas implements Comparator<String> {

        @Override
        public int compare(final String line1, final String line2) {
            String temp1 = line1.substring(0, 2).trim();
            String temp2 = line2.substring(0, 2).trim();
            return Integer.valueOf(temp2.equals("a")
                    ? "0" : temp2.equals("On")
                    ? "13" : temp2)
                    - Integer.valueOf(temp1.equals("a")
                    ? "0" : temp1.equals("On")
                    ? "13" : temp1);
        }
    }
}