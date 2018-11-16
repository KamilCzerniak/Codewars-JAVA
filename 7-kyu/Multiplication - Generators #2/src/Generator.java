public class Generator {
    private final int a;
    private int num = 1;

    private Generator(int a) {
        this.a = a;
    }

    public static Generator of(int a) {
        return new Generator(a);
    }

    public String next() {
        return String.format("%d x %d = %d", a, num, a * num++);
    }
}
