### The Office II - Boredom Score

Every now and then people in the office moves teams or departments. Depending what people are doing with their time they can become more or less boring. Time to assess the current team.

You will be provided with an array of `Person` objects with each instance containing the name and department for a staff member.
```java
public class Person {
  public final String name;        // name of the staff member
  public final String department;  // department they work in
}
```
Each department has a different boredom assessment score, as follows:

accounts = 1  
finance = 2  
canteen = 10  
regulation = 3  
trading = 6  
change = 6  
IS = 8  
retail = 5  
cleaning = 4  
pissing about = 25  

Depending on the cumulative score of the team, return the appropriate sentiment:

<=80: 'kill me now'  
< 100 & > 80: 'i can handle this'  
100 or over: 'party time!!'  

The link to this [kata](https://www.codewars.com/kata/the-office-ii-boredom-score/java)
