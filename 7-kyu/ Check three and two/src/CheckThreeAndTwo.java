public class CheckThreeAndTwo {
    public static boolean checkThreeAndTwo(char[] chars) {

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'a': {
                    a++;
                    break;
                }
                case 'b': {
                    b++;
                    break;
                }
                case 'c': {
                    c++;
                    break;
                }
            }
        }
        return (a == 2 || b == 2 || c == 2) && (a == 3 || b == 3 || c == 3);
    }
}
