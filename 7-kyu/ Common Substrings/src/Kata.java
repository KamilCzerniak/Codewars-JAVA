public class Kata {
    public static boolean SubstringTest(String str1, String str2) {
        for (int i = 0; i < str2.length() - 2; i++) {
            if (str1.toLowerCase().contains(str2.toLowerCase().substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }
}
