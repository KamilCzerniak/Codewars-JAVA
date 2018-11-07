
public class FixStringCase {
    public static String solve(final String str) {

        int upper = (int) str.chars().filter(Character::isUpperCase).count();
        int lower = (int) str.chars().filter(Character::isLowerCase).count();
        return upper > lower ? str.toUpperCase() : str.toLowerCase();
    }
}
