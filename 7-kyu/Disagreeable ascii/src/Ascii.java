public class Ascii {
    public static int getWeight(String name) {
        return name.chars()
                .filter(Character::isLetter)
                .map(c -> Character.isLowerCase(c) ? c - 32 : c + 32)
                .sum();
    }
}
