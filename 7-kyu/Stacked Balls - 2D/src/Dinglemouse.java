public class Dinglemouse {
    public static double stackHeight2d(int layers) {

        return layers == 0 ? 0 : Math.sqrt(Math.pow(layers - 1, 2) - Math.pow((layers / 2.0) - 0.5, 2)) + 1;
    }
}
