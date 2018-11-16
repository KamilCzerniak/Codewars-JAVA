public class CentParser {
    public static Integer toCents(String price) {
        return price.matches("\\$\\d+\\.\\d{2}")
                ? Integer.valueOf(price.replaceAll("[$.]", ""))
                : null;
    }
}
