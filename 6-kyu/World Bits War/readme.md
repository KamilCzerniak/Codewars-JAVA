### World Bits War

Variation of [this nice kata](https://www.codewars.com/kata/bits-battle/), the war has expanded and become dirtier and meaner; both even and odd numbers will fight with their pointy `1`s. And negative integers are coming into play as well, with, ça va sans dire, a negative contribution (think of them as spies or saboteurs).

Again, three possible outcomes: `odds win`, `evens win` and `tie`.

**Examples:**
```java
bitsWar(new int[]{1,5,12}).equals("odds win") == true   // 1+101 vs 1100, 3 vs 2
bitsWar(new int[]{7,-3,20}).equals("evens win") == true // 111-11 vs 10100, 3-2 vs 2
bitsWar(new int[]{7,-3,-2,6}).equals("tie") == true     // 111-11 vs -1+110, 3-2 vs -1+2  
```

The link to this [kata](https://www.codewars.com/kata/world-bits-war/java)
