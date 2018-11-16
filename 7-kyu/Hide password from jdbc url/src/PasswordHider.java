public class PasswordHider {
    public static String hidePasswordFromConnection(String urlString) {
        int start = urlString.indexOf("password=") + 9;
        int end = urlString.indexOf("&") < start ? urlString.length() : urlString.indexOf("&");
        return urlString.substring(0, start) + urlString.substring(start, end).replaceAll(".", "*")
                + urlString.substring(end);
    }
}
