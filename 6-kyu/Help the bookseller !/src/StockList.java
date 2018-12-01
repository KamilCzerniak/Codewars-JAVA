public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum = 0;
            for (String code : lstOfArt) {
                sum += code.charAt(0) == lstOf1stLetter[i].charAt(0)
                        ? Integer.valueOf(code.replaceAll("[^\\d]", ""))
                        : 0;
            }
            sb.append(String.format("(%s : %d)"
                    , lstOf1stLetter[i]
                    , sum))
                    .append(i != lstOf1stLetter.length - 1 ? " - " : "");
        }

        return sb.toString();
    }
}