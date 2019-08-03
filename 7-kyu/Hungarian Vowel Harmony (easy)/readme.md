### Hungarian Vowel Harmony (easy)

[Vowel harmony](https://en.wikipedia.org/wiki/Vowel_harmony) is a phenomenon in some languages. It means that "A vowel or vowels in a word are changed to sound the same (thus "in harmony.")" ([wikipedia](https://en.wikipedia.org/wiki/Vowel_harmony#Hungarian)). This kata is based on [vowel harmony in Hungarian](https://en.wikipedia.org/wiki/Vowel_harmony#Hungarian).

**Task:**  
Your goal is to create a function `dative()` (`Dative()` in C#) which returns the valid form of a valid Hungarian word `w` in [dative case](http://www.hungarianreference.com/Nouns/nak-nek-dative.aspx) i. e. append the correct suffix `nek` or `nak` to the word `w` based on vowel harmony rules.

**Vowel Harmony Rules (simplified)**  

When the last vowel in the word is

1. a front vowel (`e, é, i, í, ö, ő, ü, ű`) the suffix is `-nek`  
2. a back vowel (`a, á, o, ó, u, ú`) the suffix is `-nak`  

**Examples:**  
```java
Kata.dative("ablak") == "ablaknak"  
Kata.dative("szék") == "széknek"  
Kata.dative("otthon") == "otthonnak"  
```

**Preconditions:**  

* To keep it simple: All words end with a consonant :)  
* All strings are unicode strings.  
* There are no grammatical exceptions in the tests.
