public class Kata {
    public static int makeMove(int sticks) {

        return sticks % 4 == 0 ? 1 : sticks % 4;
    }
}
