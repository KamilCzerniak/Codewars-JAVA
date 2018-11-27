import java.math.BigInteger;


public class BinaryScore {
    public static BigInteger score(BigInteger n) {
        return BigInteger.ONE.shiftLeft(n.bitLength()).subtract(BigInteger.ONE);

    }
}
