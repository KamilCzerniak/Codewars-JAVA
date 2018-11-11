public class CWars {

    public static String initials(String name) {
        String[] s = name.split(" ");

        for (int i = 0; i < s.length - 1; i++) {
            s[i] = String.valueOf(s[i].toUpperCase().charAt(0));
        }
        s[s.length - 1] = s[s.length - 1].toUpperCase().charAt(0) + s[s.length - 1].substring(1);
        return String.join(".", s);
    }
}
