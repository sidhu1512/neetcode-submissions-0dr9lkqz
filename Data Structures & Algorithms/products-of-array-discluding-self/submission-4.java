class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        res[0] =1;
        int prefix = 1;
        for(int i = 1; i<n; i++){
            res[i] = prefix * nums[i-1];
            prefix *= nums[i-1]; 
        } 

        int postfix = 1;
        for(int i = n-2; i >= 0; i--){
            res[i] *= postfix * nums[i+1];
            postfix *= nums[i+1]; 
        } 

        return res;

    }
}  
