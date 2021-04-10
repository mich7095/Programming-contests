/*
Given an array of integers you may assume that
every element appears twice except one
Return that one element.
{1, 2, 1, 3, 4, 3, 2} => 4

Optimal solution: Bitwise operators convert their operands to their binary
form and operate on each corresponding bit in both operands.

1 ^ 2 = 3, then  0^1 1^0 - 11 - 3
3 ^ 1 = 2, then  
2 ^ 3 = 1, then  
1 ^ 4 = 5, then  
5 ^ 3 = 6, then  
6 ^ 2 = 4. 1 1^1 0^0 - 100 - 4
The concept that enables us to solve this problem is the fact that when you XOR two equal numbers,
the result is zero, and when you XOR any number with zero, the result is that number.
Other example: 
5 => 101  
7 => 111  
5 ^ 7 => 1^1 0^1 1^1 
=> 0 1 0, I mean 2 on decimal 
Time complexity: O(n)
*/
class OddOccurringElement {

    public static void main (String[] args) {
         
        int arr[] = {1, 2, 1, 3, 4, 3, 2};
        System.out.println(getOddOccurringElement(arr));
    }

    private static int getOddOccurringElement(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result;
    }


}