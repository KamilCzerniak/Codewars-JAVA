public class Spooner {

    public static String spoonerize(String words) {
        String[] s = words.split(" ");
        return String.format("%s %s", s[1].charAt(0) + s[0].substring(1), s[0].charAt(0) + s[1].substring(1));
    }
}
