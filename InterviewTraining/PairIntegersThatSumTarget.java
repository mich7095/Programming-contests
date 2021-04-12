import java.util.HashMap;

/*
Given an array of non-negative integers and a positive integer n.
Print out all the pairs of integers whose sum is n.

{1,5,9,12}, 10 => 1 9
{1,9,1,9}, 10 = > 1 9 /n 19
{1,9,1}, 10 = > 1 9

{1,2,5}, 10 = ?
*/
class SolutionTarget {

    public static void main (String[] args) {
         
        int arr[] = {1,5,9,12};
        int n = arr.length;
        int sum = 10;
         
        System.out.println(twoSum(arr, n, sum));
    }

    public static int[] twoSum(int[] arr, int n, int sum) {
        {
            // int count = 0;
     
            // Consider all possible pairs
            // and check their sums
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (arr[i] + arr[j] == sum)
                        System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
     
        throw new IllegalArgumentException("There is no solution");
    }
}
