"""
Example:

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. 
Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
"""

def almostIncreasingSequence(sequence):
    n = len(sequence)
    if n <= 2:
        return True
    c1 = 0
    c2 = 0
    
    for i in range(1, n-1):
        if sequence[i-1] >= sequence[i]:
            c1 += 1
        if sequence[i-1] >= sequence[i+1]:
            c2 += 1
    if sequence[n-1] <= sequence[n-2]:
        c1 += 1
    if c1 <= 1 and c2 <= 1:
        return True
    else:
        return False