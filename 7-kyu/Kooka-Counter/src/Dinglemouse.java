public class Dinglemouse {
    public static int kookaCounter(final String laughing) {
        StringBuilder sb = new StringBuilder(laughing);
        int cnt = 1;
        while (sb.length() > 2) {
            if (!sb.substring(0, 2).equals(sb.substring(2, 4))) {
                cnt++;
            }
            sb.delete(0, 2);
        }
        return laughing.length() == 0 ? 0 : cnt;
    }
}
