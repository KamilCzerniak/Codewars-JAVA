public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {

        int min = age > 14 ? age / 2 + 7 : (int) (age - 0.10 * age);
        int max = age > 14 ? (age - 7) * 2 : (int) (age + 0.10 * age);
        return String.format("%d-%d", min, max);
    }

    public static void main(String[] args) {
        System.out.println(datingRange(35));
    }
}
