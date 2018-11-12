public class ExcelSheetColumnNumbers {
    public static long titleToNumber(String title) {
        long result = 0;
        for (int i = 0; i < title.length(); i++) {
            result += (title.charAt(title.length() - 1 - i) - 64) * Math.pow(26, i);
        }
        return result;
    }
}
