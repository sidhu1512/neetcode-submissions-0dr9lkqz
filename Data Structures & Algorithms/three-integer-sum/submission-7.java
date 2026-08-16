class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n -2; i++){
            int j = i+1, k = n-1;
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
