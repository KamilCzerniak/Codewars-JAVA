public class Radar {
    public double CalculateTime(double[] p1, double[] p2) {
        return (Math.sqrt(Math.pow(p1[0], 2) + Math.pow(p1[1], 2))
                / Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2)) - 1) * 5;
    }
}
