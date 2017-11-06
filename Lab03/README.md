In this lab, you will write a spellchecker. Actually, you will write two spellcheckers:

# Comp 376 1 Efficiency of Search Algorithms Lab 3

- One using brute force (sequential search)
- One using decrease and conquer (binary search)

You must proceed as follows:

1. First, get these files from D2L:
    - “lab3_wordlist.txt”
    - “lab3_testdata.txt”
2. Create a file SpellChecker.java with three methods: main(), seqSearch(), binSearch().
3. Your program should take two text files as input (“lab3_wordlist.txt” and
    “lab3_testdata.txt”)
4. SeqSearch() method should use sequential search algorithm and try to find each word in
    “lab3_testdata.txt” in the “lab3_wordlist.txt” file. Keep track of the number of words you
    can’t find. (Ignore Capitalization.)
5. BinSearch() should use binary search and try to find each word in “lab3_testdata.txt” in
    the “lab3_wordlist.txt” file. Keep track of the number of words you can’t find. (Ignore
    Capitalization.)
6. For each search, determine how long it takes to check all words. Make sure you time
    only the spell checking, not the input/output or file processing.

Input to your program: the words in the two files posted on D2L.
Output from your program: for each search algorithm you test, you must output (to the console)

```
a. the number of word(s) you couldn’t find
b. the time (in Microsecond) that it took to find (a)
For example, I might output (from one of two algorithms): Note: this is not the correct
answer!
Binary search: 10 words 800.789 Microsecond
```
You should conclude:
Which algorithm is faster (binary search or sequential search)?
What is the overall efficiency class for each algorithm? (Like O (n^2 ), O (nlogn)...)
