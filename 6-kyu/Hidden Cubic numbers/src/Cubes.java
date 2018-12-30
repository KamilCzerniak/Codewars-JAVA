import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Cubes {

    public String isSumOfCubes(String s) {

        List<String> list = new ArrayList<>();

        String[] arr = s.replaceAll("[^\\d]", " ").trim().split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j += 3) {
                String temp = arr[i].substring(j, Math.min(j + 3, arr[i].length()));
                if (isCubicNumber(temp)) {
                    list.add(temp);
                }
            }
        }
        return list.size() == 0 ? "Unlucky" : String.format("%s %s Lucky"
                , String.join(" ", list)
                , list.stream().mapToInt(Integer::valueOf).sum());
    }


    private static boolean isCubicNumber(String s) {
        return Integer.valueOf(s) == Stream.of(s.split(""))
                .mapToInt(i -> (int) Math.pow(Integer.valueOf(i), 3))
                .sum();

    }
}
