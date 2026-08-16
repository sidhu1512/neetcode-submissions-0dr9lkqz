class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1, water=0, lMax= height[l], rMax = height[r];
        while(l<r){
            if(lMax< rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                water += lMax - height[l];
            }else {
                r--;
                rMax = Math.max(rMax, height[r]);
                water += rMax - height[r];
            }
        }
        return water;
    }
}
