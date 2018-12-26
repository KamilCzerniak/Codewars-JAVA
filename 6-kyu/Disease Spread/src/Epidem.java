class Epidem {

    public static int epidemic(int tm, int n, int s0, int i0, double b, double a) {

        double i = i0;
        double s = s0;
        double max = 0;
        double sNext;
        double iNext = 0;
        double dt = (double) tm / n;

        while (iNext >= max) {
            max = iNext;
            sNext = s - dt * b * s * i;
            iNext = i + dt * (b * s * i - a * i);
            i = iNext;
            s = sNext;
        }
        return (int) max;
    }
}