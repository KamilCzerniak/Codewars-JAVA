import java.math.BigDecimal;
import java.math.MathContext;


class Quadratic {

    public static double quadratic(double a, double b, double c) {
        return BigDecimal.valueOf(-b)
                .add(sqrt(BigDecimal.valueOf(b)
                        .pow(2)
                        .subtract(BigDecimal.valueOf(4)
                                .multiply(BigDecimal.valueOf(a))
                                .multiply(BigDecimal.valueOf(c)))))
                .divide(BigDecimal.valueOf(2)
                        .multiply(BigDecimal.valueOf(a)), MathContext.DECIMAL128).doubleValue();


    }

    public static BigDecimal sqrt(BigDecimal value) {
        BigDecimal res = new BigDecimal(Math.sqrt(value.doubleValue()));
        return res.add(BigDecimal.valueOf(value.subtract(res.multiply(res)).doubleValue()
                / (res.doubleValue() * 2)));
    }
}
