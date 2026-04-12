class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for(int n : nums){
            seen.add(n);
        } 

        int ans = 0;

        for(int i=0; i< nums.length; i++){
            int streak = 0;
            int curr = nums[i];

            while(seen.contains(curr)){
                streak++;
                curr +=1;
            }

            ans = Math.max(ans, streak);

        }
        return ans;
    }
}
