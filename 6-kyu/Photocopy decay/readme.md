### Photocopy decay

**Background** 

Every time you photocopy something the quality of the copy is never quite as good as the original.

But then you make a copy of copy, and then a copy of that copy, et cetera... And the results get worse each time.

This kind of degradation is called [Generation Loss](https://en.wikipedia.org/wiki/Generation_loss).

[Here](https://www.youtube.com/watch?v=G8GOcB6H0uQ) is a fun example of generation loss copying VHS tapes.

**Kata task**  

In this Kata you will be given 2 sheets of paper.

The first one is the original, and the second one is the result of copying many times. Let's call these papers `orig` and `copy`.

Only a small % of generation loss happens at each copy, but the effect is cummulative and the copies quickly become more like gibberish.

Your task is to return true/false if `orig` is a possible ancestor of `copy`.

**Notes** 
* The `orig` document may include any kind of character
* Copied characters will degrade as follows: `A`-`Z` ⇒ `a`-`z` ⇒ `#` ⇒ `+` ⇒ `:` ⇒ `.` ⇒
* For the uppercase to lowercase degradation the letters must be the same (i.e. `A` ⇒ `a` ... `Z` ⇒ `z`)

**Example** 

(5% error rate)

Original	
```
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG.  
```
After 20 copies...	
```
TH# Q+#Ck BRow# F+x J#MPS over A Laz# #+#   
:He Qui#k #rO#n foX Ju#Ps oVer a la+y Do+   
THe QUiC# b:OWn #oX ##m#s #Ver + lAZ# D#G   
##E #uIcK BROWn Fox #UMPS o#Er A LaZY doG.  
#H+ Qui## BROW# +ox jUMPs OV#r a lAzy ###.  
##e +UICK #ROWn fo# +#mPs #Ve+ a lazY dOg   
### ##IC+ Br### f#x Jump# oVE+ A La## dOg.  
th+ qUI#k bRO#n fOX #umP# o#ER A La+Y #O.   
tH# #U:#k +r+## F+# +#mP+ #VeR A ###Y DOg.  
#H# QUIcK #ROwN #o+ juM#s #V#+ A #aZy dog  
```
After 75 copies...  
```
##  q :c+ +r# . ..# #. #+   #+ a #:+:  .  
.+  Q#:## +:::  +++ :::+. .#.# . :. +  #:   
::  q#.c# . ..#   : :.:   :v:+   +a.+ .+#   
:++  :.+k +:+:# f.. .:m:  o:#  . :+#y  #+   
+#   :::. +::++  :: #:.+: #+     +:z. .:  
. e .:#c# ##:+#     : .p# +v:  . #++: #++   
..: ..:.  ++++  +++ ++:p: +ve  A L+.. # +   
::. :ui   :## : +Ox +#::: :::+ + ++ + :#  
+#   +  + +  .+ f . : +   :.   : ++ y +.+   
++  .u#+k +r#.. +:  :::+. ##   #  :+# +##   
```
The link to this [kata](https://www.codewars.com/kata/photocopy-decay/java)
 
