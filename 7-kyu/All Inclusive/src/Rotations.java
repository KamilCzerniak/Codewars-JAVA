import java.util.List;

public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {

        for (int i = 0; i < strng.length(); i++) {
            if (!arr.contains(strng)) {
                return false;
            }
            strng = strng.substring(1) + strng.charAt(0);

        }
        return true;
    }
}
