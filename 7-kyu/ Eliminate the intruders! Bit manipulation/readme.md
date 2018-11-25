### Eliminate the intruders! Bit manipulation

**Task** 
You are given a string representing a number in binary. Your task is to delete all the unset bits in this string and return the corresponding number (after keeping only the '1's).

In practice, you should implement this function:


Java
```java
public long eliminateUnsetBits(String number);
```
**Examples**  
```java
eliminate_unset_bits("11010101010101") ->  255 (= 11111111)

eliminate_unset_bits("111") ->  7

eliminate_unset_bits("1000000") -> 1

eliminate_unset_bits("000") -> 0  
```

The link to this [kata](https://www.codewars.com/kata/eliminate-the-intruders-bit-manipulation/java)
