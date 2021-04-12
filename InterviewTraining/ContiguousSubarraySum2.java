import java.util.*;

/**
 * Given an unsorted array of nonnegative integers, 
 * find a continuous subarray which adds to a given number.
 */
class Solution2 {
    public static void main (String[] args) {
        int nums[] = { 1, 2, 3, 7, 5};
        int target = 10;
        System.out.println(Arrays.toString(subArray(nums,target)));
    }
    public static int[] subArray(int[] nums, int target) {   
        Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
    }
}