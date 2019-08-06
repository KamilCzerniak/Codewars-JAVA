import java.util.ArrayList;
        import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {

        List<Integer> res = new ArrayList<>();
        int i = 0;
        for (String s : data.split("")) {
            switch (s) {
                case "i": i++; break;
                case "d": i--; break;
                case "s": i *= i; break;
                case "o": res.add(i); break;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
