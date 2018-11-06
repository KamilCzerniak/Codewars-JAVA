public class BinaryCalculator {
    public static String calculate(final String n1, final String n2, final String o) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);

        switch (o) {
            case "add": {
                return Integer.toBinaryString(a + b);
            }
            case "subtract": {
                return Integer.toBinaryString(a - b);
            }
            case "multiply": {
                return Integer.toBinaryString(a * b);
            }
        }
        return "";
    }
}
