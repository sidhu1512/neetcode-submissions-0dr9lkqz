class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0, r = 1;
        int water = 0;

        for(int i=0; i<heights.length -1 ; i++){
            for(int j=i+1; j<heights.length; j++){
                water = Math.max(water, (Math.min(heights[i], heights[j])) * (j - i));
            }

        }

        // while(r < heights.length){
        //     water = Math.max(water, (Math.min(heights[l], heights[r])) * (r - l));
        //     if(heights[r] > heights[l]) l =r;
        //     r++;
        // }
        return water;

    }
}
