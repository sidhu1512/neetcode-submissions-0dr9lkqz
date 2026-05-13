class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            int l = i+1;
            int r = n-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int target = - nums[i];
            while(l< r){
            int sum = nums[l] + nums[r];
            if(sum == target) {
                res.add(List.of(nums[i], nums[l], nums[r]));
                l++;
                r--;

                while(l < r && nums[l] == nums[l-1]) l++;
            }
            else if(sum < target) l++;
            else r--;
        } 
        }

        return res;
    }
}
