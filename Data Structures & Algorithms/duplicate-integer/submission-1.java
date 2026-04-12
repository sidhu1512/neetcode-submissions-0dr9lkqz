class Solution {
    public boolean hasDuplicate(int[] nums) {
 
        Set<Integer> basket = new HashSet<>();
        for(int i: nums){
            basket.add(i);
        }
         if (basket.size() == nums.length){
            return false;
                }
        
        return true;
        
    }
}
