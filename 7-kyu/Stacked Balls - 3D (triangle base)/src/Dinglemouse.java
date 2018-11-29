public class Dinglemouse {
    public static double stackHeight3d(int layers) {

        return layers > 0 ? Math.sqrt(2 / 3.0) * (layers - 1) + 1 : 0;
    }
}

