public class InsertDashes {
    public static String insertDash(int num) {
        String[] array = String.valueOf(num).split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length - 1; i++) {
            if (Integer.parseInt(array[i]) % 2 != 0 && Integer.parseInt(array[i + 1]) % 2 != 0) {
                sb.append(array[i]).append("-");
            } else {
                sb.append(array[i]);
            }
        }
        sb.append(array[array.length - 1]);
        return sb.toString();
    }
}
