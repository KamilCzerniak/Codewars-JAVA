public class Kata {
    public static int pointsNumber(int radius) {

        int temp = 0;
        for (int i = 0; i < Math.pow(radius, 2) / 4; i++) {
            temp += (((int) Math.pow(radius, 2) / (4 * i + 1)) - ((int) Math.pow(radius, 2) / (4 * i + 3)));
        }

        return temp * 4 + 1;
    }
}