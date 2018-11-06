public class BatmanQuotes {
    public static String getQuote(String[] quotes, String hero) {
        return String.format("%s: %s"
                , hero.startsWith("R") ? "Robin" : hero.startsWith("B") ? "Batman" : "Joker"
                , quotes[Integer.valueOf(hero.replaceAll("[^\\d]", ""))]);

    }
}
