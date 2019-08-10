import java.util.Collections;

class Hist {


    public static String hist(String s) {

        String[] errors = new String[]{"u", "w", "x", "z"};
        StringBuilder sb = new StringBuilder();

        for (String error : errors) {
            int cnt = s.length() - s.replace(error, "").length();

            if (cnt > 0) {
                sb.append(String
                        .format("%s  %d%s%s\r"
                                , error
                                , cnt
                                , String.join(""
                                        , Collections.nCopies(6 - String.valueOf(cnt).length(), " "))
                                , String.join(""
                                        , Collections.nCopies(cnt, "*"))));
            }
        }
        return sb.toString().trim();
    }
}