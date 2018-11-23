### Odd March Bits 8 bits

Odd bits are getting ready for [Bits Battles](https://www.codewars.com/kata/world-bits-war/java). Therefore the n number of bits march from right to left along 8 bits path.
Once the first bit reaches to the left their march is done. Each step will be save in an array element which will be returned. 
There is no space between the bits.
1 <= n <= 8 
**NOTE:** n != 0.Because n represents the number of 1s. Please use bitwise operations. This resemble a simple 8 LED chaser.
```java
n = 3
00000111
00001110
00011100
00111000
01110000
11100000
```
```java
n = 7
01111111
11111110
```
This is the new version.It returns int[][] instead of String[]. I had to delete the previous one because my next Kata will be based on this.

The link to this [kata](https://www.codewars.com/kata/odd-march-bits-8-bits-1/java)
