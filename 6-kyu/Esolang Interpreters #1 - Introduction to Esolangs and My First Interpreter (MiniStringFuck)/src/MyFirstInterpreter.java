public class MyFirstInterpreter {
    private String res;

    public MyFirstInterpreter(String code) {
        int cnt = 0;
        String temp = code.replaceAll("[^+.]", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c == '+') {
                cnt = (cnt + 1) % 256;
            } else {
                sb.append((char) cnt);
            }
        }
        this.res = sb.toString();
    }

    public String interpret() {
        return res;
    }
}