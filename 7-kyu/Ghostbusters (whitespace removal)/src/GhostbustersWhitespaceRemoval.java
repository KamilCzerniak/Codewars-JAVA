public class GhostbustersWhitespaceRemoval {
    public static String ghostBusters(String building) {
        return building.contains(" ")
                ? building.replace(" ", "")
                : "You just wanted my autograph didn't you?";
    }
}
