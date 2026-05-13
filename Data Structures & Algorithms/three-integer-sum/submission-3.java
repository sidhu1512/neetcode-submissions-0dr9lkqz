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
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[l]);
                temp.add(nums[r]);

                res.add(temp);

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
