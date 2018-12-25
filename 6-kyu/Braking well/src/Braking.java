public class Braking {

    public static final double g = 9.81;

    public static double dist(double v, double mu) {
        return Math.pow(v * 1000 / 3600.0, 2) / (2 * mu * g) + v * 1000 / 3600.0;
    }

    public static double speed(double d, double mu) {
        return ((-1 + Math.sqrt(1 - 4 * (1 / (2 * mu * g)) * (-d))) / (2 * (1 / (2 * mu * g)))) * 3.6;
    }
}