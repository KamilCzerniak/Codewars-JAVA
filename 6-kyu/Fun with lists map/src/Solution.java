import java.util.function.Function;

class Solution {


    public static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {

        if (head == null) {
            return null;
        }

        Node<R> newHead = new Node<>(f.apply(head.data));

        while (head.next != null) {
            head = head.next;
            newHead = add(newHead, f.apply(head.data));

        }
        return newHead;
    }

    public static <R> Node<R> add(Node<R> head, R data) {

        Node<R> node = new Node<>(data);
        Node<R> p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = node;

        return node;
    }
}