public class ParseNiceIntFromCharProblem {

    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(howOld("1"));
    }
}
