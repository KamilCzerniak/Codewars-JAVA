### Ransom Note!

You are a kidnapper! In order to get paid, you must send a note to make your ransom demands. But being clever, you don't want your handwriting to be recognized. So you clip out the characters you need from a magazine and glue them to the paper to form your ransom note.

Also, being clever, you don't want to undertake this work unless you know a magazine will actually provide all the characters for your note, so you write a method that accepts both the note's text and the magazine's text, then tells you if the note can be made from the magazine.

In addition to being clever, you are a bit lazy, so you don't care about case or punctuation (except apostraphes. Those are important), and are willing to substitute the following numbers characters for regular letters:

**Letter**|**Acceptable Substitution**
:--:|:--:
A | 4
E	| 3
I	| 1
O |	0
S	| 5
Z	| 2  

These substitutions are one way only, so you cannot substitute an 'A' for a '4'.

Your task: Write the method that will tell you whether or not a provided magazine contains enough of each character (or acceptable substitutions) that you can use it to generate a ransom note.

**Notes:**

1. You may assume that neither the note nor the magazine are empty strings (you are clever, remember?)  
2. As an extra challenge, see if you can do this without needing to iterate over the entire magazine  

The link to this [kata](https://www.codewars.com/kata/ransom-note/java)
