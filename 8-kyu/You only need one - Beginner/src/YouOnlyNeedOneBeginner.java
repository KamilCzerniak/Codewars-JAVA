public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        for (Object object : a) {
            if (object.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
