public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            s.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }
}
