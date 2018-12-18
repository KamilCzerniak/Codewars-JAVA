import java.util.Arrays;

public class EasyBal {

    public static String balance(String book) {
        String[] arr = book
                .replaceAll("[^a-zA-Z0-9\n. ]", "").split("\n+");

        StringBuilder sb = new StringBuilder();
        double balance = Double.parseDouble(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            balance -= Double.parseDouble(arr[i].split("\\s+")[2]);
            sb.append(String.format("%s Balance %.2f\\r\\n", arr[i].trim().replaceAll("\\s+", " "), balance));
        }

        return String.format("Original Balance: %s\\r\\n", arr[0])
                + sb.toString()
                + String.format("Total expense  %.2f\\r\\n"
                , Arrays.stream(arr, 1, arr.length)
                        .mapToDouble(a -> Double.parseDouble(a.split("\\s+")[2]))
                        .sum())
                + String.format("Average expense  %.2f"
                , Arrays.stream(arr, 1, arr.length)
                        .mapToDouble(a -> Double.parseDouble(a.split("\\s+")[2]))
                        .average()
                        .getAsDouble());

    }
}