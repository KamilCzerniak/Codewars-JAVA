public class BeginnerSeries4Cockroach {

    public static int cockroachSpeed(double x) {
        return (int) (x * (double) 100000 / 3600);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }
}
