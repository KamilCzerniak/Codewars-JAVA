public class HarmonicPoints {
    public static double harmPoints(double a, double b, double c) {
        return (((a - c) / (b - c)) * b + a) / (1 + (a - c) / (b - c));
    }
}
