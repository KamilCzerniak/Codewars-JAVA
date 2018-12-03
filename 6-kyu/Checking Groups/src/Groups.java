public class Groups {
    public static boolean groupCheck(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("[]", "")
                    .replace("()", "")
                    .replace("{}", "");
        }
        return s.length() == 0;
    }
}
