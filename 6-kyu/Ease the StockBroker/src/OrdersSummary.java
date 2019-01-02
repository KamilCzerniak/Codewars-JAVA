import java.util.ArrayList;
import java.util.List;

public class OrdersSummary {

    public static String balanceStatements(String lst) {

        if (lst.length() == 0) {
            return  "Buy: 0 Sell: 0";
        }

        String[] arr = lst.split(", ");
        List<String> list = new ArrayList<>();
        int sell = 0;
        int buy = 0;

        for (String s : arr) {
            if (s.matches("[A-Z0-9.]+\\s\\d+\\s[0-9]*\\.[0-9]+\\s[SB]")) {
                String[] order = s.split(" ");
                int num = (int) Math.round(Double.valueOf(order[1]) * Double.valueOf(order[2]));
                if (order[3].equals("S")) {
                    sell += num;
                } else if (order[3].equals("B")) {
                    buy += num;
                }
            } else {
                list.add(s);
            }

        }

        return list.size() == 0
                ? String.format("Buy: %d Sell: %d", buy, sell)
                : String.format("Buy: %d Sell: %d; Badly formed %d: %s ;"
                , buy
                , sell
                , list.size()
                , String.join(" ;", list));
    }
}

