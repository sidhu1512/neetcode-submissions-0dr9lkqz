class Solution {
    public int characterReplacement(String s, int k) {
       int n = s.length(), l =0, r = 0, result = 0, maxf = 0;

       Map<Character, Integer> map = new HashMap();

       while(r < n){
        char c = s.charAt(r);
        map.put(c, map.getOrDefault(c, 0) + 1);
        maxf = Math.max(maxf, map.get(c));

        while ( r - l + 1 - maxf > k){
            map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            l++;
        }
        result = Math.max(result, r - l + 1); 
        r++;
       } 

       return result;
    }
}
