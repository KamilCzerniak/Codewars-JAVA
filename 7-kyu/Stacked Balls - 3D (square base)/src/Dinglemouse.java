public class Dinglemouse {
    public static double stackHeight3d(int layers) {

        return layers > 0 ? ((layers - 1) / Math.sqrt(2)) + 1 : 0;
    }
}
