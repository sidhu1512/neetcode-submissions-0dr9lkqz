class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int curr = nums[0];

        int streak = 1;

        int res = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == curr + 1){
                res++;
                curr +=1;
            }else if(nums[i] == curr){
                continue;
            }else{
                
                res = 1;
                curr = nums[i];
            }
            streak = Math.max(streak, res);
        }

        return streak;
    }
}
