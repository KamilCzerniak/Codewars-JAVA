public class Ball {

    public static final double g = 9.81;

    public static int maxBall(int v0) {
        return (int) Math.round((v0 * 1000 / 360.0) / g);

    }
}
