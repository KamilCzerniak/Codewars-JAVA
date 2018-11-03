public class Solution {
    static int indexOf(Node head, Object value) {
        int cnt = 0;
        while (head != null) {
            if (head.data.equals(value)) {
                return cnt;
            }
            cnt++;
            head = head.next;
        }
        return -1;
    }
}
