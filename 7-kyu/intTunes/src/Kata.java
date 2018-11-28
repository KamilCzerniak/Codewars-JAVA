public class Kata {
    public static boolean isTune(int[] notes) {
        if (notes == null || notes.length == 0) {
            return false;
        }

        int cnt = 0;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length; j++) {
                String temp = String.valueOf((notes[j] - notes[i]) % 12);
                if (temp.matches("-10|-8|-6|-5|-3|-1|0|2|4|5|6|7|9|11")) {
                    cnt++;
                } else {
                    cnt = 0;
                    break;
                }
            }
            if (cnt == notes.length) {
                return true;
            }
        }
        return false;
    }
}
