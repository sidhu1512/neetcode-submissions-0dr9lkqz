class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i] > 0)  break;

            if(i >0  && nums[i] == nums[i-1]) continue;
            int target = 0 - nums[i];


            int j = i+1;
            int k = n-1;

            while(j<k){
                if(target == nums[j] + nums[k]){
                    ans.add( List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j -1]){
                        j++;
                    }
                }else if(target > nums[j] + nums[k]){
                    j++;
                }else {
                    k--;
                }
            }
        }

        return ans;
    }
}
