public class CountConsonants {
    public static int getCount(String str) {
        return str.toLowerCase().replaceAll("[^a-z]|[aeiou]", "").length();
    }
}
