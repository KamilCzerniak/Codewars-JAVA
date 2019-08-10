import java.util.function.Predicate;

class Solution {
    static <T> int countIf(Node<T> head, Predicate<T> p) {

        int cnt = 0;
        while (head != null) {
            if (p.test(head.data)) {
                cnt++;
            }
            head = head.next;
        }
        return cnt;
    }
}