public class Logic {
    public static Boolean multImplication(boolean[] lst) {
        if (lst.length > 0) {
            boolean result = lst[0];
            for (int i = 1; i < lst.length; i++) {
                result = !result || lst[i];
            }
            return result;
        }
        return false;
    }
}
