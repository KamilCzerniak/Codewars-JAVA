import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoopBugFixing1 {

    public static List CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }

    public static void main(String[] args) {

    }

}
