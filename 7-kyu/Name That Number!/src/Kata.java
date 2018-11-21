public class Kata {
    public static String nameThatNumber(int x) {
        String[] numbers = {
                "zero"
                , "one"
                , "two"
                , "three"
                , "four"
                , "five"
                , "six"
                , "seven"
                , "eight"
                , "nine"
                , "ten"
                , "eleven"
                , "twelve"
                , "thirteen"};

        return x < 14 ? numbers[x]
                : x == 15 ? "fifteen"
                : x == 18 ? "eighteen"
                : x < 20 ? numbers[x % 10] + "teen"
                : (x < 30 ? "twenty"
                : x < 40 ? "thirty"
                : x < 50 ? "forty"
                : x < 60 ? "fifty"
                : x / 10 == 8 ? "eighty"
                : numbers[x / 10] + "ty") + (x % 10 != 0 ? " " + numbers[x % 10] : "");
    }
}
