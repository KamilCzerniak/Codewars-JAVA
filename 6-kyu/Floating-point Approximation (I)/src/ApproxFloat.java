import java.math.BigDecimal;

class ApproxFloat {

    public static double f(double x) {
        return sqrt(BigDecimal.valueOf(x).add(BigDecimal.ONE)).subtract(BigDecimal.ONE).doubleValue();
    }


    private static BigDecimal sqrt(BigDecimal value) {
        BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
        return x.add(new BigDecimal(value.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
    }
}