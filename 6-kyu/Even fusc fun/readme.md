### Even fusc fun

A fusc function is defined as:
```java
fusc(1) = 1
fusc(2n) = fusc(n)
fusc(2n+1) = fusc(n) + fusc(n+1)
```
we are interested what would be the next closest number (`m` such that `m>=n`) to `n` such that `fusc(m)%2 ==0`.

For example the fusc sequence up to 6th element is:
```
[1 1 2 1 3 2]
```
so we will have:
```
closestEvenFusc(1) = 3
closestEvenFusc(2) = 3
closestEvenFusc(3) = 3
closestEvenFusc(4) = 6
```
Input value `n` is guaranteed to be correct (`n>0`).

The link to this [kata](https://www.codewars.com/kata/even-fusc-fun/java)
