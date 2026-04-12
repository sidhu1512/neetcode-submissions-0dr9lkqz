class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeroCnt = 0;

        for(int n : nums){
            if(n != 0){
                product *= n;
            }else{
                zeroCnt++;
            }
            
        }

        if(zeroCnt > 1){
            return new int[nums.length];
        }

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(zeroCnt > 0){
                if(nums[i]  == 0){
                    ans[i] = product;
                    return ans;
                }
            }else{
                ans[i] = product/nums[i];
            }              
        }

        return ans;
    }
}  
