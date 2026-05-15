class Solution {
    public int trap(int[] height) {

        //approach min (lmax, rmax) - H[i]
        
        int len = height.length, l = 0, r = len -1;

        int[] lmax = new int[len];
        int[] rmax = new int[len];

        int prefix = height[0];
        lmax[0] = height[0];
        for(int i=1; i< len; i++){
            prefix = Math.max(prefix, height[i -1]);
            lmax[i] = prefix;
        }

        int postfix= height[len -1];
        rmax[len -1] = height[len -1];
        for(int i= len -2; i>= 0; i--){
            postfix = Math.max(height[i+1], postfix);
            rmax[i] = postfix;
        }

        int res = 0;
        for(int i =0; i< len; i++){
            int curr = Math.min(lmax[i],rmax[i]) - height[i];
            if(curr > 0) res += curr;
            
        }

        return res;
        
    }
}
