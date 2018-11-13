
public class FindingRemainder {
    public static SimpleInteger remainder(SimpleInteger dividend, SimpleInteger divisor) {
        return divisor.equals(new SimpleInteger(0)) ? null : dividend.subtract((dividend.divide(divisor)).multiply(divisor));
    }
}
