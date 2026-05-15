class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;
        
        int n = s.length();
        int l =0, r=1;
        int res =0;
        
        for(int i =1; i< n; i++){
            while(r< n){

                while(s.substring(l,r).contains(String.valueOf(s.charAt(r)))){
                    l++;
                }
                res = Math.max(res, s.substring(l,r).length());
                r++;
            }
        }

        return res +1;
    }
}
