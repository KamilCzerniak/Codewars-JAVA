public class Solution {
    static int lastIndexOf(Node head, Object value) {
        int cnt = 0;
        int index = -1;
        Node p = head;
        while (p != null) {
            if (p.data.equals(value)) {
                index = cnt;
            }
            cnt++;
            p = p.next;
        }
        return index;
    }
}
