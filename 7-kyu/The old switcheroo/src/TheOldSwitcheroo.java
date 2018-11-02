public class TheOldSwitcheroo {
    public static String vowel2Index(String s) {

        if (s.length() != 0) {
            String[] array = s.split("");
            for (int i = 1; i <= array.length; i++) {
                if (array[i - 1].toLowerCase().replaceAll("[aeiou]", "").length() == 0) {
                    array[i - 1] = String.valueOf(i);
                }
            }
            return String.join("", array);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));
    }
}
