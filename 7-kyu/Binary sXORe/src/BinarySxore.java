import java.math.BigInteger;

public class BinarySxore {
    public static BigInteger sxore(BigInteger n) {

        BigInteger[] bigIntegers = {n, BigInteger.ONE, n.add(BigInteger.ONE), BigInteger.ZERO};
        return bigIntegers[n.mod(BigInteger.valueOf(4)).intValue()];

    }
}
