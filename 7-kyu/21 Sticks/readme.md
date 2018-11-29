### 21 Sticks

**The Game:**  

In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins. Like this:
```
21 sticks. Bob takes 2. 19 sticks. Alice takes 3. 16 sticks. Bob takes 3. 13 sticks. Alice takes 1. 12 sticks.  
Bob takes 2. 10 sticks. Alice takes 2. 8 sticks. Bob takes 3. 5 sticks. Alice takes 3. 1 stick. Bob takes 1. 
Bob wins!
```
**Your task:**

Create a robot that will always win the game. Your robot will always go first. You will write a function that accepts a number and returns `1`, `2`, or `3`. Python users are allowed to use the module `random` and Java users allowed to use `java.util.Random`. To avoid cheating, `random.seed` is disabled in Python. Your program will play 10 games. The function accepts the number of sticks left and returns the number you want to take.

**Example:**
```
makeMove(5)
# => 1
```
**Notes:**  
* As this kata is still in beta, I want users to comment on this kata. Otherwise this kata will not be approved.
* This is focusing mainly on logic and not code. This kata is really easy if you think about it for a while.

The link to this [kata](https://www.codewars.com/kata/21-sticks/java)
