public class Indice {

    public static int solve(String str, int index) {
        if (str.charAt(index) != '(') {
            return -1;
        }
        int cnt = 1;
        for (int i = index + 1; i < str.length(); i++) {
            cnt += str.charAt(i) == '(' ? 1 : str.charAt(i) == ')' ? -1 : 0;
            if (cnt == 0) {
                return i;
            }
        }
        return -1;
    }
}