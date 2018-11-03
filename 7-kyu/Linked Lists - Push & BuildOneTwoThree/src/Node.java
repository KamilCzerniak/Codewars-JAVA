public class Node {
    public int data;
    Node next = null;

    public Node(final int data) {
        this.data = data;
    }

    public static Node push(final Node head, final int data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }

    public static Node buildOneTwoThree() {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        third.next = null;
        return head;
    }
}
