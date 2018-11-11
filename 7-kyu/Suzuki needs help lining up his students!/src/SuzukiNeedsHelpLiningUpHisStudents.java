import java.util.Arrays;
import java.util.Comparator;

public class SuzukiNeedsHelpLiningUpHisStudents {


    public static String[] lineupStudents(String students) {
        String[] s = students.split(" ");
        Arrays.sort(s, Comparator.comparingInt(String::length).reversed());

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j].length() == s[j + 1].length()) {
                    if (s[j].compareTo(s[j + 1]) < 0) {
                        String temp;
                        temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }
        return s;
    }
}
