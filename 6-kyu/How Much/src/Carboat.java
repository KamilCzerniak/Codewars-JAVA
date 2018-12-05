public class Carboat {

    public static String howmuch(int m, int n) {
        StringBuilder sb = new StringBuilder("[");
        for (int f = Math.min(m, n); f <= Math.max(m, n); f++) {
            if ((f - 2) % 7.0 == 0 && (f - 1) % 9.0 == 0) {
                sb.append(String.format("[M: %d B: %d C: %d]", f, (f - 2) / 7, (f - 1) / 9));
            }
        }
        return sb.append("]").toString();
    }
}