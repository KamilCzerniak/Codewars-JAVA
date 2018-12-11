public class PigLatin {
    public String translate(String str) {
        String s = str.toLowerCase();
        if (s.replaceAll("[a-z]", "").length() != 0) {
            return null;
        } else if (String.valueOf(s.charAt(0)).matches("[aeiou]")) {
            return s + "way";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length() && !String.valueOf(s.charAt(i)).matches("[aeiou]")) {
            sb.append(s.charAt(i));
            i++;
        }
        return s.substring(i) + sb.toString() + "ay";
    }
}
