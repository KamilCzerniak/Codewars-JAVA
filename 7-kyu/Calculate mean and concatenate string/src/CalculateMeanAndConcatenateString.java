public class CalculateMeanAndConcatenateString {
    public static Object[] mean(char[] lst) {

        double sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lst.length; i++) {
            if (Character.isDigit(lst[i])) {
                sum += Integer.parseInt(String.valueOf(lst[i]));
            } else {
                sb.append(lst[i]);
            }
        }
        return new Object[]{sum / 10, sb.toString()};
    }
}
