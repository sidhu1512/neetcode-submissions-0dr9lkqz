class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int n: nums) unique.add(n);
        int ans =0;
        for(int n: nums){
            int curr = n,  max=0;
            if(unique.contains(curr -1)) continue;
            while(unique.contains(curr++)) max++;
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
