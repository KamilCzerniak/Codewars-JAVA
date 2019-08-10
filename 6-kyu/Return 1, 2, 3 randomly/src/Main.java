import java.util.Random;

public class Main {

    private static int oneTwo() {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    public static int oneTwoThree() {

        int x = oneTwo() - 1;
        int y = oneTwo() - 1;
        return x == 1 && y == 0 ? oneTwoThree() : x + y + 1;
    }
}