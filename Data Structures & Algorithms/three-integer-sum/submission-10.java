class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<nums.length -2; i++){
            if(nums[i] > 0)  break;
            if(i >0  && nums[i] == nums[i-1]) continue;
            int j = i+1, k = nums.length-1;
            while(j<k){
                if(0 - nums[i] == nums[j] + nums[k]){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k])); j++; k--;
                }else if(0 - nums[i] < nums[j] + nums[k]) k--;
                else j++;
            }
        }
        return new ArrayList<>(set);
    }
}
