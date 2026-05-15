class Solution {
    public int trap(int[] height) {

        //2 pointer approach min (lmax, rmax) - H[l/r]
        int len = height.length, l =0, r = len -1, lmax = height[l], rmax = height[r];

        int res =0;
        while(l<r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if(lmax < rmax) {
                res += Math.min(lmax, rmax) - height[l];
                l++;
            }
            else {
                res += Math.min(lmax, rmax) - height[r];
                r--;
            }
        }

        return res;
    }
}
