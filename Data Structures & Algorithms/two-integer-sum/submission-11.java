class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap using difference and index, o(n)tc, o(n)sc
        Map<Integer, Integer> indecies = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(indecies.containsKey(nums[i])) return new int[]{indecies.get(nums[i]), i};
            indecies.put(target-nums[i], i);
        }
        return new int[]{0,0}; 
    }
}
