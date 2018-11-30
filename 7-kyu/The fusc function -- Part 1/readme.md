### The fusc function -- Part 1

The fusc function is defined recursively as follows:
```
fusc(0) = 0
fusc(1) = 1
fusc(2n) = fusc(n)
fusc(2n + 1) = fusc(n) + fusc(n + 1)
```
Your job is to produce the code for the `fusc` function. In this kata, your function will be tested with small values of `n`, so you should not need to be concerned about stack overflow or timeouts.  

The link to this [kata](https://www.codewars.com/kata/the-fusc-function-part-1/java)
