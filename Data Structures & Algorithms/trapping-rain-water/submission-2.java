class Solution {
    public int trap(int[] height) {
        //2pointer
        int l=0, r=height.length-1, total=0, lMax= height[l], rMax = height[r];
        while(l<r){
            if(lMax< rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                total += lMax - height[l];
            }else {
                r--;
                rMax = Math.max(rMax, height[r]);
                total += rMax - height[r];
            }
        }
        return total;
    }
}
