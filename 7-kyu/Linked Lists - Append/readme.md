### Linked Lists - Append

Write an Append() function which appends one linked list to another. The head of the resulting list should be returned.
```java
var listA = 1 -> 2 -> 3 -> null
var listB = 4 -> 5 -> 6 -> null
append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
```

If both listA and listB are null/NULL/None/nil, return null/NULL/None/nil. If one list is null/NULL/None/nil and the other is not, simply return the non-null/NULL/None/nil list.

The push() and buildOneTwoThree() (`build_one_two_three()` in PHP and ruby) functions need not be redefined. The Node `class` is also predefined for you in PHP.
```java
/* PHP Only */
class Node {
  public $data, $next;
  public function __construct($data, $next = NULL) {
    $this->data = $data;
    $this->next = $next;
  }
}
```
Related Kata in order of expected completion (increasing difficulty):  
[Linked Lists - Push & BuildOneTwoThree](http://www.codewars.com/kata/linked-lists-push-and-buildonetwothree)  
[Linked Lists - Length & Count](http://www.codewars.com/kata/linked-lists-length-and-count)  
[Linked Lists - Get Nth Node](http://www.codewars.com/kata/linked-lists-get-nth-node)  
[Linked Lists - Insert Nth Node](http://www.codewars.com/kata/linked-lists-insert-nth-node)  
[Linked Lists - Sorted Insert](http://www.codewars.com/kata/linked-lists-sorted-insert)  
[Linked Lists - Insert Sort](http://www.codewars.com/kata/linked-lists-insert-sort)  
[Linked Lists - Append](http://www.codewars.com/kata/linked-lists-append)  
[Linked Lists - Remove Duplicates](http://www.codewars.com/kata/linked-lists-remove-duplicates)  
[Linked Lists - Move Node](http://www.codewars.com/kata/linked-lists-move-node)  
[Linked Lists - Move Node In-place](http://www.codewars.com/kata/linked-lists-move-node-in-place)  
[Linked Lists - Alternating Split](http://www.codewars.com/kata/linked-lists-alternating-split)  
[Linked Lists - Front Back Split](http://www.codewars.com/kata/linked-lists-front-back-split)  
[Linked Lists - Shuffle Merge](http://www.codewars.com/kata/linked-lists-shuffle-merge)  
[Linked Lists - Sorted Merge](http://www.codewars.com/kata/linked-lists-sorted-merge)  
[Linked Lists - Merge Sort](http://www.codewars.com/kata/linked-lists-merge-sort)  
[Linked Lists - Sorted Intersect](http://www.codewars.com/kata/linked-lists-sorted-intersect)  
[Linked Lists - Iterative Reverse](http://www.codewars.com/kata/linked-lists-iterative-reverse)  
[Linked Lists - Recursive Reverse](http://www.codewars.com/kata/linked-lists-recursive-reverse)  

Inspired by Stanford Professor Nick Parlante's excellent [Linked List teachings.](http://cslibrary.stanford.edu/103/LinkedListBasics.pdf)

The link to this [kata](https://www.codewars.com/kata/linked-lists-append/java)
