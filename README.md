# EXAM_recursion
At kalde en metode indefra den samme metode. Nogle problemer løses lettere rekursivt end iterativt. F.eks. sorteringsalgoritmer som merge sort (?). Generelt fylder rekursive metoder mindre end iterative. 
Til gengæld er det i næsten alle tilfælde mere effektivt ift. ressourcebrug at løse problemer med iterative algoritmer, pga. stack-brug. Alle rekursive løsninger kan reduceres til iterative.

## Factorial 
Rekursiv måde at finde fakulteten (factorial på engelsk) af et tal. Fakulteten er produktet af alle tal fra 1 op til n.
Altså: 
<prev><code>factorial(3) = 321 = 6</code></prev>
<prev><code>factorial(4) = 4321 = 24</code></prev>
<br>
Dette kan nemt gøres rekursivt, ved at gange n med fakulteten af n-1. Base case er 1, da fakulteten af 1 er 1 gange 1 = 1.

https://en.wikipedia.org/wiki/Factorial

## Fibonacci 
Fibonacci-tallene er betegnelsen for de tal som findes i følgen

<prev><code>0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...</code></prev><br>
Fra og med det tredje fremkommer tallene som summen af de to foregående tal i følgen: 1 = 1 + 0, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 osv.

https://da.wikipedia.org/wiki/Fibonacci-tal

## File path 

Muligvis for svært. Kom gerne på flere eksempler på rekursion. Måske noget sortering? To fluer med et smæk.
