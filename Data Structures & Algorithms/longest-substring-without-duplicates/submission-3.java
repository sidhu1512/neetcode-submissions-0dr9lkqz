class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int result = 0;
        if(s.length() == 0) return result;

        int left = 0;
        int right = 0;

        while(right < s.length()){
            while(right < s.length() && !seen.contains(s.charAt(right))){
                seen.add(s.charAt(right));
                right++;
            }
            result = Math.max(result, seen.size());
            if(right == s.length()) return result;
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            right++;
        } 

    return result;
    }
}
