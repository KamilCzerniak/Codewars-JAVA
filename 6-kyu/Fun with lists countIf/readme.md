### Fun with lists: countIf

Implement the method countIf (`count_if` in PHP), which accepts a linked list (head) and a predicate function, and returns the number of elements which apply to the given predicate.

For example: Given the list: `1 -> 2 -> 3`, and the predicate `x => x >= 2`, countIf / `count_if` should return 2, since `x >= 2` applies to both 2 and 3.

The linked list is defined as follows:
```java
class Node<T> {
  public T data;
  public Node<T> next;

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

Good luck!  

The link to this [kata](https://www.codewars.com/kata/fun-with-lists-countif/java)
