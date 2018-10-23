public class FormattingDecimalPlaces0 {

    public static double TwoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    public static void main(String[] args) {

    }
}
