>1. Answers to question 1 below, written on this file.
>2. A working java program for question 2.
***
1- The Trans-Canada Highway (TCH) follows a completely straight line as it crosses the Canadian prairies. Gas stations occur at various intervals. Assuming that the first station is a mile 0, and the last station is at mile n, find the distance between two closest stations. (The distance between two stations x and y is computed as |x − y|.)
Input is the mile maker locations of the gas stations, for example:
   480    231   0   477   121    ...   1176    501    2000 (for n=2000)
Output for this example (based on the input we can see) would be: |480 – 477| = 3

1. Design and write pseudocode for a presorting-based transform and-conquer algorithm that solve this problem. (You can use the word “sort” and do not need to implement that method)
[2 mark]





2. Design and write pseudocode for a brute-force algorithm that solve this problem. [2 mark]








3. Compare the efficiency of your algorithm for part A with your algorithm for part B. [1 mark]











***
2- Design and implement an algorithm that finds the smallest k numbers (in value) out of n numbers. For example, if given an array with eight numbers {4, 5, 1, 6, 2, 7, 3, 8}, return the least four numbers 1, 2, 3, and 4.
The algorithm that sort the n input numbers increasingly and returns the first K number is not acceptable for the answer. Since it needs to sort, its time complexity is O(n logn). You should design more efficient algorithm using Max-heap. [5 mark]

Hint.
You should create a max-heap with capacity k that will contain the least k numbers out of n input numbers.  A correct answer will be O(n logk) 
In Java, the PriorityQueue class is implemented as a priority heap. You can find a sample code in D2l that shows the basic operations of PriorityQueue. Note, for this question, I would suggest to pay extra attention to poll(). 
