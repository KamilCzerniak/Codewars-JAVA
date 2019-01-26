### Split and then add both sides of an array together.

Inspired by the "Fold an Array" kata. This one is sort of similar but a little different.

You will receive an array as paramter that contains 1 or more integers and a number `n`

Here is a little visualization of the process:

Step 1)

Divide the array in half:
```
1): {1,2,5,7,2,3,5,7,8}

2): {1,2,5,7} {2,3,5,7,8}
```
Step 2)

Put the arrays on top of each other:
```
  {1,2,5,7}
{2,3,5,7,8}
```
Step 3)

Add them together:
```
{2,4,7,12,15}
```
Step 4)

Do this `n` times or until there is only one number left, and then return the array

Example with input:
```
int[] arr = {4,2,5,3,2,5}
______________________

n = 2

1): {4,2,5,3,2,5,7}

2): {4,2,5} {3,2,5,7}

      {4,2,5}
3): {3,2,5,7}

4): {3,6,7,12}

_______________________

n = 1

1): {3,6,7,12}

2): {3,6} {7,12}

     {3,6}
3): {7,12} 

4): {10,18}
```
return `{10,18}`

The link to this [kata](https://www.codewars.com/kata/split-and-then-add-both-sides-of-an-array-together/java)
