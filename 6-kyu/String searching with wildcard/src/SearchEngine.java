public class SearchEngine {
    static int find(String needle, String haystack) {

        String[] arr = haystack.split("");

        for (int i = 0; i <= arr.length - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                char temp = needle.charAt(j);
                if (arr[i + j].charAt(0) != temp && temp != '_') {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }


}
