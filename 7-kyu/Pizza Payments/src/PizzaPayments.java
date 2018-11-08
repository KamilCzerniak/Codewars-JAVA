public class PizzaPayments {
    public static double michaelPays(double cost) {
        return Math.round((cost < 5 ? cost : cost / 3 > 10 ? cost - 10 : cost - cost / 3) * 100) / 100.0;
    }
}
