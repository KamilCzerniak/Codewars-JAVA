import java.util.stream.IntStream;

public class Dinglemouse {

    public static int tvRemote(final String word) {
        String temp = "a" + word;
        String remote = "abcde123fghij456klmno789pqrst.@0uvwxyz_/";
        return IntStream.range(0, temp.length() - 1)
                .reduce(0, (a, b) -> a + (Math.abs(remote.indexOf(temp.charAt(b)) % 8
                        - remote.indexOf(temp.charAt(b + 1)) % 8)
                        + Math.abs(remote.indexOf(temp.charAt(b)) / 8
                        - remote.indexOf(temp.charAt(b + 1)) / 8) + 1));
    }
}