### Fun with lists: length

Implement the method length, which accepts a linked list (head), and returns the length of the list.

For example: Given the list: `1 -> 2 -> 3 -> 4`, length should return 4.

The linked list is defined as follows:
```java
class Node {
  public Object data;
  public Node next;

  Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }

  Node(T data) {
    this(data, null);
  }
}
```
Note: the list may be null and can hold any type of value.

The link to this [kata](https://www.codewars.com/kata/fun-with-lists-length/java)
