public class Dinglemouse {

    final public static String[] NUM = {"no", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static String tenGreenBottles(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            String number = NUM[i].toUpperCase().charAt(0) + NUM[i].substring(1);
            sb.append(String.format("%s green %s hanging on the wall,\n" +
                            "%s green %s hanging on the wall,\n" +
                            "%s one green bottle should accidentally fall,\n" +
                            "There'll be %s green %s hanging on the wall.\n"
                    , number
                    , i == 1 ? "bottle" : "bottles"
                    , number
                    , i == 1 ? "bottle" : "bottles"
                    , i == 1 ? "If that" : "And if"
                    , NUM[i - 1]
                    , i == 2 ? "bottle" : "bottles"))
                    .append(i > 1 ? "\n" : "");
        }

        return sb.toString();
    }
}