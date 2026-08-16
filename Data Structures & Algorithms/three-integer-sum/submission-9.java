class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i] > 0)  break;
            if(i >0  && nums[i] == nums[i-1]) continue;
            int j = i+1, k = n-1;
            while(j<k){
                if(0 - nums[i] == nums[j] + nums[k]){
                    ans.add( List.of(nums[i], nums[j], nums[k])); j++; k--;
                    while(j < k && nums[j] == nums[j -1]) j++;
                }else if(0 - nums[i] > nums[j] + nums[k]) j++;
                else k--;
            }
        }
        return ans;
    }
}
