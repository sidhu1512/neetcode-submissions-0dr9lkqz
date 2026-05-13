class Solution {
    public int maxArea(int[] heights) {
        
        int len = heights.length, l = 0, r = len -1;
        int res = 0;

        while(l<r){
            int area = (r - l) * Math.min(heights[l] , heights[r]);
            res = Math.max(res, area);

            if(heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }

        }

        return res;
    }
}
