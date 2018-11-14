### Automorphic Number (Special Numbers Series #6)  

**Definition**  
A number is called Automorphic number if and only if its square ends in the same digits as the number itself.  

**Task**  
Given a number determine if it Automorphic or not.  

**Notes**  
* The number passed to the function is positive.  
* Single-digit numbers are considered Automorphic number.  

**Input >> Output Examples**  
```java
1- autoMorphic (25) -->> return "Automorphic"  
```
**Explanation:**  
`25` squared is `625`, ends with the same number's digits which are `25`.  
```java
2- autoMorphic (13) -->> return "Not!!"  
```
**Explanation:**  
`13` squared is `169`, not ending with the same number's digits which are `69`.  
```java
3- autoMorphic (76) -->> return "Automorphic"  
```
**Explanation:**  
`76` squared is `5776`, ends with the same number's digits which are `76`.  
```java
5- autoMorphic (225) -->> return "Not!!"  
```
**Explanation:**  
`225` squared is `50625`, not ending with the same number's digits which are `225`. 
```java
4- autoMorphic (625) -->> return "Automorphic"  
```
**Explanation:**  
`625` squared is `390625`, ends with the same number's digits which are `625`.  
```java
6- autoMorphic (1) -->> return "Automorphic"  
```
**Explanation:**  
`1` squared is `1`, ends with the same number's digits which are `1`.  
```java
7- autoMorphic (6) -->> return "Automorphic"  
```
**Explanation:**  
`6` squared is `36`, ends with the same number's digits which are `6`.  

The link to this [kata](https://www.codewars.com/kata/automorphic-number-special-numbers-series-number-6/java)
