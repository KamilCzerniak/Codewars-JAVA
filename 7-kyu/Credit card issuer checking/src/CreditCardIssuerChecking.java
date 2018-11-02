public class CreditCardIssuerChecking {
    public static String getIssuer(String cardNumber) {
        if ((cardNumber.substring(0, 2).matches("34|37")) && cardNumber.length() == 15) {
            return "AMEX";
        } else if (cardNumber.substring(0, 4).equals("6011") && cardNumber.length() == 16) {
            return "Discover";
        } else if (cardNumber.substring(0, 2).matches("51|52|53|54|55") && cardNumber.length() == 16) {
            return "Mastercard";
        } else if (cardNumber.substring(0, 1).equals("4") && (cardNumber.length() == 13 || cardNumber.length() == 16)) {
            return "VISA";
        }
        return "Unknown";
    }
}
