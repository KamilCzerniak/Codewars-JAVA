public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double r = d / 2.0;
        double H = vt / (Math.PI * Math.pow(r, 2));
        return (int) ((((Math.PI * Math.pow(r, 2) * Math.acos(1 - (h / r))) / Math.toRadians(180)) - (r - h) * Math.sqrt(2 * h * r - Math.pow(h, 2))) * H);

    }
}
