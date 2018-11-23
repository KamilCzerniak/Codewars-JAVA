import java.util.function.Predicate;

class Solution {
    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        if (head == null) {
            return false;
        } else if (p.test(head.data)) {
            return true;
        }
        return anyMatch(head.next, p);
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {

        if (head == null) {
            return true;
        } else if (!p.test(head.data)) {
            return false;
        }
         return allMatch(head.next,p);
    }
}