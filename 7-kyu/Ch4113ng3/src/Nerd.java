public class Nerd {
    public static String nerdify(String txt) {
        return txt.replaceAll("[aA]", "4")
                .replaceAll("[eE]", "3")
                .replaceAll("[l]", "1");
    }
}
