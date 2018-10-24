public class SurfaceAreaAndVolumeOfABox {

    public static int[] getSize(int w, int h, int d) {
        return new int[]{2 * (w * d + w * h + d * h), w * h * d};
    }
}
