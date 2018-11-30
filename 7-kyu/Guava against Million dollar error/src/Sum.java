import com.google.common.base.Preconditions;

public class Sum{
    public static Double sum(Double a, Double b) {
        Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
        Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");
        Preconditions.checkArgument(a > 0.0, "Illegal Argument passed: Non-positive value %s.", a);
        Preconditions.checkArgument(b > 0.0, "Illegal Argument passed: Non-positive value %s.", b);
        return a+b;
    }
}