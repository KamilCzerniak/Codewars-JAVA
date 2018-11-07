public class Covfefe {
    public static String covfefe(String tweet) {
        return tweet.contains("coverage")
                ? tweet.replace("coverage", "covfefe")
                : tweet + " covfefe";
    }
}
