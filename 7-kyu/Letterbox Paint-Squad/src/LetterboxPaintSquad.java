public class LetterboxPaintSquad {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] digits = new int[10];
        for (int i = start; i <= end; i++) {
            String[] temp = String.valueOf(i).split("");
            for (String s : temp) {
                digits[Integer.valueOf(s)]++;
            }
        }
        return digits;
    }
}
