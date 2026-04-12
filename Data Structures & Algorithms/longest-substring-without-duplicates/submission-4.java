class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int result = 0, left = 0, right = 0;

        while(right < s.length()){
            char c = s.charAt(right);

            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            result = Math.max(result, seen.size()); 
            right++;
        } 
    return result;
    }
}
