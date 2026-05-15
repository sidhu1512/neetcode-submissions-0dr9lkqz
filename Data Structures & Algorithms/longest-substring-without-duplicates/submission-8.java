class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int n = s.length();
        int l =0, r=0;
        int res =0;

        while(r < n){
            char c = s.charAt(r);

            while(seen.contains(c)){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(c);
            res = Math.max(res, seen.size());
            r++;  
        }

        return res;
    }
}
