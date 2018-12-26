import java.math.BigInteger;

public class Oddity {

    public static String oddity(BigInteger n) {
        return Math.sqrt(n.intValue()) % 1 == 0 ? "odd" : "even";
    }

}
