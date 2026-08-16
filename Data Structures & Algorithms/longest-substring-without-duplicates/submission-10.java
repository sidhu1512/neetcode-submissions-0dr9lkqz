class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max=0, len = s.length();
        if(len < 2) return len;
        Set<Character> isSeen = new HashSet<>();
        while(r<len){
            while(isSeen.contains(s.charAt(r))){
                isSeen.remove(s.charAt(l));
                l++;
            }
            isSeen.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}
