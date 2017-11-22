1 - An anagram is a rearrangement of the letters of one word to form another word. For example, the
words tea and eat are anagrams. Both words must have the same number of letters. Capitalization is
ignored. Here are some additional examples:

|Origin | Anagram |
| --- | --- |
| Algorithm | logarithm |
| Conversationalists | conservationalists |

There are numerous techniques for finding out if two words are anagrams. For example:

**Technique #1:**

for each letter in word 1

```
search word 2 for the letter
if found, delete the letter from word 2
```
**Technique #2:**

sort word 1

sort word 2

use a linear compare of the 2 sorted words

**Technique #3:**

create letter vector for word 1 and word

use a linear compare of the letter vectors

***
Your challenge today (this week) is not simply to devise an algorithm to determine if two words are
anagrams. Instead we are going to look for the word (or words) that have the largest number of anagrams,
in the English language dictionary.

Furthermore, you are going to apply all of the three techniques to the above problem in an attempt to find
the fastest anagram checking technique and measure the efficacy based on execution time. You will
compare the efficiency of three anagram techniques.


Input to your program(s): the words in the file named Dict, posted on D2L.

Output from your program(s): for each technique you test, you must output (to the console)

```
a. the word(s) with most anagrams
b. the time (in seconds) that it took to find (a)
```
For example, I might output (from one of three techniques): Note: this is not the correct answer!

Technique #1: [dog] has 2 anagrams 445.789 secs

I am looking for you to approach this exercise as a scientific experiment. As with all experiments we start
by asking some questions. In this case they could be:

Which technique is fastest for finding the word (or words) that have the largest number of anagrams?

What is the overall efficiency class for each technique?(like O(n), O(nlogn),..)


