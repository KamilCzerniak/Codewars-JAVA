public class LeonardoDicaprioAndOscars {
    public static String leo(final int oscar) {
        return oscar < 86 || oscar == 87 ? "When will you give Leo an Oscar?"
                : oscar == 86 ? "Not even for Wolf of wallstreet?!"
                : oscar == 88 ? "Leo finally won the oscar! Leo is happy"
                : "Leo got one already!";
    }
}
