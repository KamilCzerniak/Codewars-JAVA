class Node {

    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node append(Node listA, Node listB) {
        if (listA == null && listB == null) {
            return null;
        } else if (listA == null) {
            return listB;
        } else if (listB == null) {
            return listA;
        }

        Node p = listA;
        while (p.next != null) {
            p = p.next;

        }
        p.next = listB;
        return listA;
    }
}