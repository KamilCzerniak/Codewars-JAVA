public class FakeBinary {

    public static String fakeBin(String numberString) {

        StringBuilder fake = new StringBuilder();
        for (String s : numberString.split("")) {
            if (Integer.valueOf(s) >= 5) {
                fake.append("1");
            } else if (Integer.valueOf(s) < 5) {
                fake.append("0");
            }
        }
        return fake.toString();
    }

    public static void main(String[] args) {

    }
}
