public class HowDoICompareNumbers {

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return p[1].toString();
        }
        return "nothing";
    }
}
