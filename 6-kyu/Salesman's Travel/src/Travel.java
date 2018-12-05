import java.util.Arrays;
public class Travel {
    public static String travel(String r, String zipcode) {
        String[] array = Arrays.stream(r.split(","))
                .filter(s -> s.substring(s.length() - 8).equals(zipcode))
                .toArray(String[]::new);
        StringBuilder address = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            number.append(array[i], 0, array[i].indexOf(" ")).append(i < array.length - 1 ? "," : "");
            address.append(array[i], array[i].indexOf(" ") + 1, array[i].length() - 9)
                    .append(i < array.length - 1 ? "," : "");
        }

        return String.format("%s:%s/%s"
                , zipcode
                , address
                , number);
    }
}