public class NicknameGenerator {
    public static String nickname(String name) {
        return name.length() < 4
                ? "Error: Name too short"
                : String.valueOf(name.charAt(2)).matches("[aeiou]")
                ? name.substring(0, 4)
                : name.substring(0, 3);
    }
}
