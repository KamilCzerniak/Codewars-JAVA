public class LocalizeTheBarycenterOfATriangle {


    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double x0 = (x[0] + y[0] + z[0]) / 3;
        double y0 = (x[1] + y[1] + z[1]) / 3;
        return new double[]{Double.parseDouble(String.format("%.4f", x0)),
                Double.parseDouble(String.format("%.4f", y0))};
    }


}
