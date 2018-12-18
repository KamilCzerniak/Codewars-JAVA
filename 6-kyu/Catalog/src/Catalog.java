import java.util.Arrays;
import java.util.stream.Collectors;

public class Catalog {
    public static String catalog(String s, String article) {
        return !s.contains(article) ? "Nothing" : Arrays
                .stream(s.split("\n\n"))
                .filter(a -> a.contains(article))
                .map(b -> String.format("%s > prx: $%s qty: %s"
                        , b.substring(b.indexOf("<name>") + 6, b.indexOf("</name>"))
                        , b.substring(b.indexOf("<prx>") + 5, b.indexOf("</prx>"))
                        , b.substring(b.indexOf("<qty>") + 5, b.indexOf("</qty>"))))
                .collect(Collectors.joining("\n"));
    }
}