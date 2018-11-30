import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {

    public static ToDoubleFunction<Triangle> f = p -> {
        p.setArea((1 / 2.0) * p.base * p.height);
        return p.getArea();
    };
}
