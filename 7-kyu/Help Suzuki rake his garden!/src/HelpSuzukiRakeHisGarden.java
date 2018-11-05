
public class HelpSuzukiRakeHisGarden {
    public static String rakeGarden(String garden) {

        String[] s = garden.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (!s[i].matches("gravel|rock")) {
                s[i] = "gravel";
            }
        }
        return String.join(" ", s);
    }
}
