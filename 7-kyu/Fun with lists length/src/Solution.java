public class Solution {
    static int length(Node head) {
        int size = 0;
        Node p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }
}
