class Solution {
    public boolean hasDuplicate(int[] nums) {
 
        Set<Integer> basket = new HashSet<>();
        for(int i: nums){
            if(basket.contains(i)){
                return true;
            }
            basket.add(i);
        }
            return false;
        
    }
}
