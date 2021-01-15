class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int elem;

        for(int i=0; i< nums.length; i++){
            elem = target-nums[i];

            if(map.containsKey(elem)){
                return new int[] {map.get(elem), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("There is no solution");
    }
}
