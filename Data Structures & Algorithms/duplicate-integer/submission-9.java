class Solution {
    public boolean hasDuplicate(int[] nums) {
        //use Set, O(n)tc, o(n)sc
        //if sorted then use if nums[i-1] != nums[i], o(n) tc, o(1)sc
        //sort and then use if nums[i-1] != nums[i], o(nlogn)tc, o(1)sc
        // Set<Integer> isDuplicate = new HashSet();
        // for(int n:nums){
        //     if(isDuplicate.contains(n))return true;
        //     isDuplicate.add(n);
        // }
        // return false;
        return Arrays.stream(nums).distinct().count() != nums.length;// o(n)tc, o(n)sc
    }
}