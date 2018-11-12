public class HistogramH1 {
    public static String histogram(final int results[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = results.length; i > 0; i--) {
            sb.append(String.format("%s|", i));
            for (int j = 0; j < results[i - 1]; j++) {
                sb.append("#");
            }
            sb.append(results[i - 1] > 0 ? " " + results[i - 1] : "").append("\n");
        }
        return sb.toString();
    }
}
