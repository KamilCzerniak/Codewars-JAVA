
public class AllStarCodeChallenge18 {
    public static long strCount(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
}
